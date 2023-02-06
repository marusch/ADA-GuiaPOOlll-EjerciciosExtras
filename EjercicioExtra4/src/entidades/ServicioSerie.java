package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioSerie {

    private ArrayList<Serie> listaSeries;

    public ServicioSerie(){
        this.listaSeries = new ArrayList<>();
    }

    public ServicioSerie(ArrayList<Serie> listaSeries) {
        this.listaSeries = listaSeries;
    }

    public ArrayList<Serie> getListaSeries() {
        return listaSeries;
    }

    public void setListaSeries(ArrayList<Serie> listaSeries) {
        this.listaSeries = listaSeries;
    }

    public void CrearSerie(){
        Scanner input = new Scanner(System.in);
        Serie serie = new Serie();

        System.out.println("Ingrese el nombre de la serie: ");
        String nombre = input.next();
        serie.setNombre(nombre);

        System.out.println("Ingrese la categoria de la serie: ");
        String categoria = input.next();
        serie.setCategoria(categoria);

        System.out.println("Ingrese la duracion de la serie, en minutos: ");
        int duracion = input.nextInt();
        serie.setDuracion(duracion);

        añadirSerie(serie);
    }

    public void añadirSerie(Serie serie){
        this.listaSeries.add(serie);
    }

    public void verLista(){
        System.out.println("\n" + "⏳ Listado completo de series: ");
        for (Serie lista : listaSeries) {
            System.out.println(lista);
        }
    }

    public void menor15(){
        System.out.println("\n" + "⏳ Listado completo de series menores o igual a 15 minutos: ");
        for (Serie i : listaSeries) {
            if (i.getDuracion() <= 15){
                System.out.println(i);
            }
        }
    }

    public void mayor40(){
        System.out.println("\n" + "⏳ Listado completo de series mayores o igual a 40 minutos: ");
        for (Serie i : listaSeries) {
            if (i.getDuracion() >= 40){
                System.out.println(i);
            }
        }
    }

    public void categoriaRomance(){
        System.out.println("\n" + "⏳ Listado completo de series Categoria ROMANCE : ");
        for (Serie i : listaSeries) {
            if (i.getCategoria().equalsIgnoreCase("Romance")){
                System.out.println(i);
            }
        }
    }

    public void categoriaComedia(){
        System.out.println("\n" + "⏳ Listado completo de series Categoria COMEDIA : ");
        for (Serie i : listaSeries) {
            if (i.getCategoria().equalsIgnoreCase("Comedia")){
                System.out.println(i);
            }
        }
    }

    public void categoriaDrama(){
        System.out.println("\n" + "⏳ Listado completo de series Categoria DRAMA : ");
        for (Serie i : listaSeries) {
            if (i.getCategoria().equalsIgnoreCase("Drama")){
                System.out.println(i);
            }
        }
    }

}
