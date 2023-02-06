import entidades.Libro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Libro listaLibros = new Libro();

        String fin="";

        do {

            listaLibros.CrearLibros();

            System.out.println("Si desea ingresar otro, presione Si," +
                    " de lo contrario para salir, cualquier tecla");
          fin = input.next();

        }while (fin.equalsIgnoreCase("Si"));

        listaLibros.verListadoLibros();
        listaLibros.LibrosMenor150P();
        listaLibros.LibrosMayor300P();

    }
}