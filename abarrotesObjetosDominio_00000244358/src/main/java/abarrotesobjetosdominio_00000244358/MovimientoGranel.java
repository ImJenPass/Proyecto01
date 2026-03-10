/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abarrotesobjetosdominio_00000244358;

/**
 *
 * @author Juan Arballo, Juan Alatorre
 */
public class MovimientoGranel extends ProductoGranel {
    private String productoGranel;
    
    //i.	El constructor por defecto

    public MovimientoGranel() {
    }
    
    //j.	Un constructor que inicialice los atributos de la clase al valor de sus parámetros.

    public MovimientoGranel(String productoGranel) {
        this.productoGranel = productoGranel;
    }

    public MovimientoGranel(String productoGranel, float cantidad, String clave, String nombre, char tipo, String unidad) {
        super(cantidad, clave, nombre, tipo, unidad);
        this.productoGranel = productoGranel;
    }
    
    //el K es el que no se como hacerle XD
    //l.	Métodos de acceso, getXxx() y setXxx(), para cada uno de sus atributos.

    public String getProductoGranel() {
        return productoGranel;
    }

    public void setProductoGranel(String productoGranel) {
        this.productoGranel = productoGranel;
    }
    
    //toString()

    @Override
    public String toString() {
        return "MovimientoGranel{" + "productoGranel=" + productoGranel + '}';
    }
    
    
}
