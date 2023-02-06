import entidades.Mascota;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Mascota mascota = new Mascota();
        String fin="";

        System.out.println("Sistema de carga de mascotas"+ "\n" +
                "A continuacion, ingrese los siguientes datos:");
        do {

            mascota.crearMascota();
            System.out.println("Desea ingresar otro, Presione S, de lo contrario cualquier tecla " +
                    " para salir");
            fin = input.next();

        }while (fin.equalsIgnoreCase("s"));


        System.out.println("\n" + "Lista de mascotas: ");
        mascota.verListado();

        System.out.println("\n" + "Lista de mascotas mayores de 6 años: ");
        mascota.mayores6años();

        System.out.println("\n" + "Lista de mascotas menores de 5 años: ");
        mascota.menor5años();

    }
}