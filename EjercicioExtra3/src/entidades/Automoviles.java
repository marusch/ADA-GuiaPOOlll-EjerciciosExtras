package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Automoviles {

    private String marca;
    private int stock;

    private ArrayList<Automoviles> listaAutom;

    public Automoviles(){
        this.listaAutom = new ArrayList<>();
    }

    public Automoviles(String marca, int stock, ArrayList<Automoviles> listaAutom) {
        this.marca = marca;
        this.stock = stock;
        this.listaAutom = listaAutom;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Automoviles> getListaAutom() {
        return listaAutom;
    }

    public void setListaAutom(ArrayList<Automoviles> listaAutom) {
        this.listaAutom = listaAutom;
    }

    public void crearCarga() {
        Scanner input = new Scanner(System.in);
        Automoviles automoviles = new Automoviles();

        System.out.println("Ingrese la marca a cargar");
        marca = input.next();
        automoviles.setMarca(marca);

        System.out.println("Ingrese su el stock disponible");
        stock = input.nextInt();
        automoviles.setStock(stock);

        añadirDatos(automoviles);

    }

    public void añadirDatos(Automoviles automoviles){
        this.listaAutom.add(automoviles);
    }

    public void listaExistente(){
        System.out.println("📌 Lista de la carga 📌");
        for (Automoviles a : listaAutom) {
            System.out.println(a);
        }
    }

    public void StockMenor3(){
        for (Automoviles i : listaAutom) {
            if (i.getStock() <= 3){
                System.out.println("\n" + "Lista de marcas con menor Stock : ");
                System.out.println(i);
            }
        }
    }

    public void StockMayor10(){
        for (Automoviles i : listaAutom) {
            if (i.getStock() >= 10){
                System.out.println("\n" + "Lista de marcas con mayor Stock : ");
                System.out.println(i);
            }
        }
    }


    @Override
    public String toString() {
        return "\n" +
                "Marca: " + marca + "\n" +
                "Stock: " + stock;
    }
}
