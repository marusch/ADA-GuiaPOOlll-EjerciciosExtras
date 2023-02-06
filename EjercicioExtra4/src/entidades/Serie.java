package entidades;

public class Serie {

    private String categoria;
    private int duracion;
    private String nombre;

    public Serie(){

    }

    public Serie(String categoria, int duracion, String nombre) {
        this.categoria = categoria;
        this.duracion = duracion;
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return
                "Nombre: " + nombre + "\n" +
                "Categoria: " + categoria + "\n" +
                "Duracion: " + duracion + "\n" +
                "\n";
    }
}
