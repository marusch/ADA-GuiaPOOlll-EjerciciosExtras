package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Mascota {
    
    private String nombre;
    private String tipo;
    private int edad;
    private ArrayList<Mascota> listaMascotas;

    public Mascota(){
        this.listaMascotas = new ArrayList<>();
    }

    public Mascota(String nombre, String tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void crearMascota(){
        Mascota mascota = new Mascota();
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre de su mascota");
        nombre = input.next();
        mascota.setNombre(nombre);
        System.out.println("Ingrese la edad de su mascota");
        edad = input.nextInt();
        mascota.setEdad(edad);
        System.out.println("Ingrese que tipo de animal es su mascota");
        tipo = input.next();
        mascota.setTipo(tipo);

    añadirMascota(mascota);

    }

    public void añadirMascota(Mascota mascota) {
        this.listaMascotas.add(mascota);
    }

    public void verListado(){
        for (Mascota masc : listaMascotas) {
            System.out.println(masc);
        }
    }

    @Override
    public String toString() {
        return
                "Nombre: " + nombre + "\n" +
                "Tipo: " + tipo + "\n" +
                "Edad: " + edad + "\n";
    }
}
