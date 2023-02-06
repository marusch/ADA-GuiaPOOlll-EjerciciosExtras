package entidades;

import java.util.Scanner;

public class Menu {

    Mascota mascota = new Mascota();
    String termina = "";
    int opcion;
    Scanner input = new Scanner(System.in);

    public void menu(){

        do {
            System.out.println("Seleccione una opcion para continuar - 1 Añadir - 2-Lista -3-Salir");
            opcion = input.nextInt();
            switch (opcion){

                case 1:
                    System.out.println("Añadir una mascota a la lista");
                    mascota.crearMascota();

                    System.out.println("Gracias su mascota fue añadida con exito. Para volver al menu presione S," +
                            " de lo contrario cualquier tecla para salir");
                    termina= input.next();

                    break;

                case 2:
                    System.out.println("\n" + "Lista de mascotas");
                    mascota.verListado();

                    System.out.println("Para volver al menu presione S, de lo contrario cualquier tecla para salir");
                    termina= input.next();

                    break;

                case 3:

                    System.out.println("Has finalizado el proceso");

            }
        }while (termina.equalsIgnoreCase("S"));
    }

}
