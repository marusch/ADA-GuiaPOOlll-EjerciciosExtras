import entidades.ServicioSerie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ServicioSerie listas = new ServicioSerie();
        String fin = "";


        System.out.println("SISTEMA DE CARGA - INGRESE LOS SIGUIENTES DATOS:  ");
        do {

            listas.CrearSerie();

            System.out.println("Si desea ingresar otra serie, Presione S, de lo contrario cualquier tecla para salir: ");
            fin = input.next();

        }while (fin.equalsIgnoreCase("S"));

        listas.verLista();

        listas.menor15();

        listas.mayor40();

        listas.categoriaRomance();

        listas.categoriaDrama();

        listas.categoriaComedia();
    }
}