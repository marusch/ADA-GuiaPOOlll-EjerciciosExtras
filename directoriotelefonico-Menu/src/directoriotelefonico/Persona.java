package directoriotelefonico;

public class Persona {

    private String telefono;
    private String nombre;
    private String apellidos;

    public Persona() {
        this.telefono = "";
        this.nombre = "";
        this.apellidos = "";
    }

    public Persona(String telefono, String nombre, String apellidos) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Telefono: " + this.telefono + "\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos;
    }

}
