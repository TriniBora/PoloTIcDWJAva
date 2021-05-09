package ejercicio1.c;

public class Logica {

    public static void main(String[] args) {

        Mascota mascotas[] = new Mascota[5];

        Mascota mascota1 = new Mascota("Noel", "Perro", "Macho", "Blanco-negro", "Largo", "Border-collie");
        Mascota mascota2 = new Mascota("Gerry", "Gato", "Macho", "Blanco", "Corto", "Mestizo");
        Mascota mascota3 = new Mascota("Pipi", "Ave", "Macho", "Multicolor", "Plumas", "loro");
        Mascota mascota4 = new Mascota("Gordita", "Perro", "Hembra", "Gris", "Largo", "Mestizo");
        Mascota mascota5 = new Mascota("Fini", "Perro", "Hembra", "Marrón", "Corto", "Mestizo");

        mascotas[0] = mascota1;
        mascotas[1] = mascota2;
        mascotas[2] = mascota3;
        mascotas[3] = mascota4;
        mascotas[4] = mascota5;

        for (int i = 0; i < mascotas.length; i++) {
            System.out.println("Mascota " + (i + 1) + ": " + mascotas[i].getNombre() + ", " + mascotas[i].getEspecie() + ", " + mascotas[i].getSexo());
        }
        
        System.out.println("");

        mascotas[2].setNombre("Perico");
        mascotas[4].setNombre("Chiquita");
        
        System.out.println("");

        System.out.println("Mascota 3: " + mascotas[2].getNombre() + ", " + mascotas[2].getEspecie() + ", " + mascotas[2].getSexo());
        System.out.println("Mascota 5: " + mascotas[4].getNombre() + ", " + mascotas[4].getEspecie() + ", " + mascotas[4].getSexo());

        System.out.println("");
        
        for (int i = 0; i < mascotas.length; i++) {
            String especie = mascotas[i].getEspecie().toUpperCase();
            if (especie.equals("PERRO")) {
                System.out.println("Mascota " + (i + 1) + ": " + mascotas[i].getNombre() + ", " + mascotas[i].getEspecie() + ", " + mascotas[i].getSexo());
            }
        }

    }

}
