/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abarrotesobjetosdominio_00000244358;

/**
 *
 * @author Juan Arballo, Juan Alatorre
 */
public class MovimientoEmpacado extends ProductoEmpacado{
    private String productoEmpacado;

    //Constructor por defecto
    public MovimientoEmpacado() {
    }
    
    //Un constructor que analice los atributos de la clase al valor de sus parametros
    public MovimientoEmpacado(String productoEmpacado) {
        this.productoEmpacado = productoEmpacado;
    }

    public MovimientoEmpacado(String productoEmpacado, int cantidad, String clave, String nombre, char tipo, String unidad) {
        super(cantidad, clave, nombre, tipo, unidad);
        this.productoEmpacado = productoEmpacado;
    }
    
    //k.	Un constructor que reciba sólo la clave del movimiento e inicialice con ella el atributo de su clase, los demás atributos de la clase se inicializan a null o false.
    //Este si no se como hacerle XD
    
    
    //l.	Métodos de acceso, getXxx() y setXxx(), para cada uno de sus atributos.

    public String getProductoEmpacado() {
        return productoEmpacado;
    }

    public void setProductoEmpacado(String productoEmpacado) {
        this.productoEmpacado = productoEmpacado;
    }
    
    //m.	El método toString() 

    @Override
    public String toString() {
        return "MovimientoEmpacado{" + "productoEmpacado=" + productoEmpacado + '}';
    }
    
    
    
}
