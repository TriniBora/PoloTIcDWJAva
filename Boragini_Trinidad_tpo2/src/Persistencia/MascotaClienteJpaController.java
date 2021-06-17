package Persistencia;

import Logica.MascotaCliente;
import Persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class MascotaClienteJpaController implements Serializable {

    public MascotaClienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public MascotaClienteJpaController() {
        emf = Persistence.createEntityManagerFactory("Boragini_Trinidad_tpo2PU");
    }

    public void create(MascotaCliente mascotaCliente) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(mascotaCliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(MascotaCliente mascotaCliente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            mascotaCliente = em.merge(mascotaCliente);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = mascotaCliente.getNum_cliente();
                if (findMascotaCliente(id) == null) {
                    throw new NonexistentEntityException("The mascotaCliente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            MascotaCliente mascotaCliente;
            try {
                mascotaCliente = em.getReference(MascotaCliente.class, id);
                mascotaCliente.getNum_cliente();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The mascotaCliente with id " + id + " no longer exists.", enfe);
            }
            em.remove(mascotaCliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<MascotaCliente> findMascotaClienteEntities() {
        return findMascotaClienteEntities(true, -1, -1);
    }

    public List<MascotaCliente> findMascotaClienteEntities(int maxResults, int firstResult) {
        return findMascotaClienteEntities(false, maxResults, firstResult);
    }

    private List<MascotaCliente> findMascotaClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(MascotaCliente.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public MascotaCliente findMascotaCliente(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(MascotaCliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getMascotaClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<MascotaCliente> rt = cq.from(MascotaCliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
