package Logica;

import java.util.List;

public class Usuario {
    
    private int id_usuario;
    private String user;
    private String contrasenia;
    private List <Reserva> listaReservas;

    public Usuario() {
    }

    public Usuario(int id_usuario, String user, String contrasenia, List<Reserva> listaReservas) {
        this.id_usuario = id_usuario;
        this.user = user;
        this.contrasenia = contrasenia;
        this.listaReservas = listaReservas;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }
    
    
}
