package Formulario;
/**
 * La clase Productos representa un producto dentro de un formulario.
 * Contiene información sobre el nombre y precio del producto.
 *
 * @author Luis Velasco
 * @version 1.0
 * @since 2025
 */
public class Productos {
    private String nombre;
    private double precio;

    /**
     * Constructor de la clase Productos.
     * Inicializa el nombre y el precio del producto.
     *
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     */
    public Productos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    /**
     * Obtiene el nombre del producto.
     *
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece un nuevo nombre para el producto.
     *
     * @param nombre Nuevo nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene el precio del producto.
     *
     * @return El precio del producto.
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * Establece un nuevo precio para el producto.
     *
     * @param precio Nuevo precio del producto.
     * @throws IllegalArgumentException Si el precio es negativo.
     */
    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }
    /**
     * Muestra la información del producto.
     */
    public void imprimirProducto() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio + " €");
    }
    /**
     * Método obsoleto que imprimía los datos de forma simplificada.
     * Se recomienda usar {@link #imprimirProducto()} en su lugar.
     *
     * @deprecated Usar {@link #imprimirProducto()} en su lugar.
     */
    @Deprecated
    public void imprimirProductoObsoleto() {
        System.out.println(nombre + " cuesta $" + precio);
    }
}