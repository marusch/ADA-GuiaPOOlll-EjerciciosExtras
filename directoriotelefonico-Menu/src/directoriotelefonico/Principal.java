package directoriotelefonico;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leerDato = new Scanner(System.in);
        boolean salir = false;
        String opcion = "";
        ArrayList<Persona> directorioTelefonico = new ArrayList<Persona>();
        Persona objPer;
        String telefono = "", nombre = "", apellidos = "";

        while (!salir) {

            System.out.println("\n--- Gestionar Directorio Telefónico ---\n");
            System.out.println("1. Agregar persona");
            System.out.println("2. Modificar persona");
            System.out.println("3. Eliminar persona");
            System.out.println("4. Mostrar todas las personas");
            System.out.println("5. Salir\n");

            System.out.print("Ingrese opción: ");
            opcion = leerDato.nextLine();

            switch (opcion) {
                case "1"://Agregar persona
                    System.out.println("\n--- Agregar persona ---\n");

                    System.out.print("Teléfono: ");
                    telefono = leerDato.nextLine();

                    System.out.print("Nombre: ");
                    nombre = leerDato.nextLine();

                    System.out.print("Apellidos: ");
                    apellidos = leerDato.nextLine();

                    objPer = new Persona(telefono, nombre, apellidos);

                    directorioTelefonico.add(objPer);

                    break;
                case "2"://Modificar persona
                    System.out.println("\n--- Modificar persona ---\n");

                    System.out.print("Teléfono: ");
                    telefono = leerDato.nextLine();

                    Persona personaEncontradaMod = null;

                    for (Persona obj : directorioTelefonico) {
                        if (obj.getTelefono().equals(telefono)) {
                            personaEncontradaMod = obj;
                        }
                    }

                    if (personaEncontradaMod != null) {
                        System.out.println("\n--- Menú ---\n");
                        System.out.println("1. Modificar teléfono");
                        System.out.println("2. Modificar nombre");
                        System.out.println("3. Modificar apellidos");
                        System.out.println("4. Regresar a menu principal");

                        System.out.print("\nIngrese opción: ");
                        opcion = leerDato.nextLine();

                        switch (opcion) {
                            case "1"://Modificar teléfono
                                System.out.print("Teléfono: ");
                                telefono = leerDato.nextLine();
                                
                                personaEncontradaMod.setTelefono(telefono);

                                break;
                            case "2"://Modificar nombre
                                System.out.print("Nombre: ");
                                nombre = leerDato.nextLine();
                                
                                personaEncontradaMod.setNombre(nombre);

                                break;
                            case "3"://Modificar apellidos
                                System.out.print("Apellidos: ");
                                apellidos = leerDato.nextLine();
                                personaEncontradaMod.setApellidos(apellidos);
                                
                                break;
                            case "4"://Regresar al menu principal

                                break;
                            default:
                                System.out.println("\n¡¡¡ Opción Inválida !!!");
                        }

                    } else {
                        System.out.println("\n¡¡¡ La persona no existe en el directorio !!!\n");
                    }

                    break;
                case "3"://Eliminar persona
                    System.out.println("\n--- Eliminar persona ---\n");

                    System.out.print("Teléfono: ");
                    telefono = leerDato.nextLine();

                    Persona personaEncontrada = null;

                    for (Persona obj : directorioTelefonico) {
                        if (obj.getTelefono().equals(telefono)) {
                            personaEncontrada = obj;
                        }
                    }

                    if (personaEncontrada != null) {
                        if (directorioTelefonico.remove(personaEncontrada)) {
                            System.out.println("\nLa persona fue eliminada con éxito.\n");
                        } else {
                            System.out.println("\nSe presentó un error al eliminar la persona del directorio telefónico.\n");
                        }
                    } else {
                        System.out.println("\n¡¡¡ La persona no existe en el directorio !!!\n");
                    }

                    break;
                case "4"://Mostrar todas las personas
                    System.out.println("\n--- Lista de personas en el directorio telefónico --\n");
                    if (directorioTelefonico.size() > 0) {
                        for (Persona obj : directorioTelefonico) {
                            System.out.println(obj.getTelefono() + " -- " + obj.getNombre() + " -- " + obj.getApellidos());
                        }
                    } else {
                        System.out.println("\n¡¡¡ No hay personas en el directorio telefónico !!!\n");
                    }

                    break;
                case "5":
                    System.out.println("\n¡¡¡ Adios !!!");
                    salir = true;
                    break;
                default:
                    System.out.println("\n¡¡¡ Por favor, elija una opción válida !!!");
            }

            if (!salir) {
                System.out.print("\nOprima ENTER para volver a Menú Principal ...");
                leerDato.nextLine();
            }

        }

    }

}
