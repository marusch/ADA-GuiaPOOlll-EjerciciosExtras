import entidades.Automoviles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Automoviles listado = new Automoviles();

        String fin="";

        System.out.println("Sistema de carga - Concesionaria S.A" + "\n" + "Ingrese los siguientes datos:" );

        do {

            listado.crearCarga();

            System.out.println("Si desea ingresar otro presione S, " +
                    "de lo contrario para salir cualquier tecla");
            fin = input.next();

        }while (fin.equalsIgnoreCase("S"));

        listado.listaExistente();
        listado.StockMenor3();
        listado.StockMayor10();
    }
}