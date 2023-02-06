package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Libro {

    private String titulo;
    private String autor;
    private int paginas;

    private ArrayList<Libro> listaLibros;

    public Libro(){
        this.listaLibros = new ArrayList<>();
    }


    public Libro(String titulo, String autor, int paginas, ArrayList<Libro> listaLibros) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.listaLibros = listaLibros;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void CrearLibros(){
        Scanner input = new Scanner(System.in);
        Libro libro = new Libro();

        System.out.println("Ingrese el titulo del libro");
        titulo = input.next();
        libro.setTitulo(titulo);

        System.out.println("Ingrese su respectivo autor");
        autor = input.next();
        libro.setAutor(autor);

        System.out.println("Ingrese la cantidad de paginas que posee");
        paginas = input.nextInt();
        libro.setPaginas(paginas);


        añadirLibro(libro);


    }

    public void añadirLibro(Libro libro){
        this.listaLibros.add(libro);
    }

    public void verListadoLibros(){
        System.out.println("\n" + "📚 Listado de libros cargados: ");
        for (Libro lista : listaLibros) {
            System.out.println(lista);
        }
    }

    public void LibrosMayor300P(){
        for (Libro i : listaLibros) {
            if (i.getPaginas() >=300){
                System.out.println("\n" + "Libros con 300 o mas paginas: ");
                System.out.println(i);
            }
        }
    }

    public void LibrosMenor150P(){
        for (Libro i : listaLibros) {
            if (i.getPaginas() <=150){
                System.out.println("\n" + "Libros con 150 o menos paginas: ");
                System.out.println(i);
            }
        }
    }

    @Override
    public String toString() {
        return   "\n" +
                "Titulo: " + titulo + "\n" +
                "Autor: " + autor + "\n"  +
                "Paginas: " + paginas;
    }
}
