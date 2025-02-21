package Formulario;
/**
 * La clase Datos recoge los datos para llenar un formulario.
 * @author Luis Velasco
 * @version 1.0
 * @since 2025
 */
public class Datos {
    String nombre;
    int edad;

    /**
     * Constructor de la clase Datos.
     * @param nombre Nombre del usuario.
     * @param edad Edad del usuario
     */
    public Datos (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    /**
     * Imprime en consola los datos del usuario.
     */
    public void imprimirDatos () {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad:" + this.edad);
    }
    /**
     * Establece un nuevo nombre para el usuario.
     *
     * @param nombre Nuevo nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene el nombre del usuario.
     *
     * @return El nombre actual del usuario.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece una nueva edad para el usuario.
     *
     * @param edad Nueva edad del usuario.
     * @throws IllegalArgumentException Si la edad es menor a 0.
     */
    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        } else {
            this.edad = edad;
        }
    }
    /**
     * Obtiene la edad del usuario.
     *
     * @return La edad actual del usuario.
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Método obsoleto que imprimía los datos de forma simple.
     * Se recomienda usar {@link #imprimirDatos()} en su lugar.
     *
     * @deprecated Usar {@link #imprimirDatos()} en su lugar.
     */
    @Deprecated
    public void imprimirDatosObsoleto() {
        System.out.println(nombre + " tiene " + edad + " años.");
    }
}