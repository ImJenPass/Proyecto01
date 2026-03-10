/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abarrotesobjetosdominio_00000244358;

/**
 *
 * @author Juan Arballo, Juan Alatorre
 */
//Producto Empacado es heredado de la clase Producto
public class ProductoEmpacado extends Producto {

    private int cantidad;

    //Constructor por defecto
    public ProductoEmpacado() {
    }

    /*Constructor que reciba como parámetros un objeto de tipo Peoducto y una Cantidad floatante
    y que inicialice con ellos los atributos de su clase padre y de su clase al valor de los parámetros.
     */
    public ProductoEmpacado(int cantidad) {
        this.cantidad = cantidad;
    }

    public ProductoEmpacado(int cantidad, String clave, String nombre, char tipo, String unidad) {
        super(clave, nombre, tipo, unidad);
        this.cantidad = cantidad;
    }

    /*Constructor que reciba sólo un producto e inicialice con él atributo de su clase padre, el atributo 
    cantidad se inicializará con 0.
     */
    public ProductoEmpacado(Producto producto) {
        super(producto.getClave(), producto.getNombre(), producto.getTipo(), producto.getUnidad());
        this.cantidad = 0;
    }

    //Gets y sets para los atributos.
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String getClave() {
        return clave;
    }

    @Override
    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public char getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getUnidad() {
        return unidad;
    }

    @Override
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    /*Método toString() que regresa una cadena con los valores de los atributos de la clase (de su cuperclase y los propios).
    Los valores de los atributos irán separados por comas sin saltos de línea u otra información adicional.
     */
    @Override
    public String toString() {
        return "ProductoEmpacado{" + "cantidad=" + cantidad + '}';
    }

    /*
    f.	Se debe asegurar en todas las situaciones donde aplique de lo siguiente: 
i.	Se cumplen con todas las validaciones de un Producto.
ii.	La clave del producto a granel debe iniciar por GR.
iii.	La cantidad del producto a granel debe ser al menos de 0.01.
iv.	La clave del producto empacado debe iniciar por EM.
v.	La cantidad del producto empacado debe ser al menos 1.
     */
}
