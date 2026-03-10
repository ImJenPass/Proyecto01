/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abarrotesobjetosdominio_00000244358;

import java.util.Objects;

/**
 *
 * @author Juan Arballo, Juan Alatorre
 */
public class Movimiento {

    private String cveMovimiento;
    private String fecha;
    private boolean procesado;

    //Constructor por defecto
    public Movimiento() {
    }

    /*
    Un constructor que inicialice los atributos de la clase al valor de sus parámetros.
    a.	La clave del movimiento se debe componer de dos caracteres y tres dígitos. Ejemplo MV001, MV002, etc.
    b.	La clave del movimiento se generará automáticamente y de forma consecutiva iniciando por el MV001.
     */
    public Movimiento(String cveMovimiento, String fecha, boolean procesado) {
        this.cveMovimiento = cveMovimiento;
        this.procesado = procesado;
    }


    /*
    c.	Un constructor que reciba sólo la clave del movimiento e inicialice con ella el atributo de su clase, 
    los demás atributos de la clase se inicializarán a null o false.
     */
    public Movimiento(String cveMovimiento) {
        this.cveMovimiento = cveMovimiento;
        this.fecha = null;
        this.procesado = false;
    }

    //Gets y sets para cada uno de los atributos
    public String getCveMovimiento() {
        return cveMovimiento;
    }

    public void setCveMovimiento(String cveMovimiento) {
        this.cveMovimiento = cveMovimiento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }



    public boolean isProcesado() {
        return procesado;
    }

    public void setProcesado(boolean procesado) {
        this.procesado = procesado;
    }

    /*
    e.	El método equals(Object object) que compara este movimiento con el objeto del parámetro. 
    El método regresa verdadero si el objeto del parámetro es de la clase Movimiento y ambos tienen la misma clave, 
    falso en caso contrario. 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movimiento other = (Movimiento) obj;
        if (this.procesado != other.procesado) {
            return false;
        }
        if (!Objects.equals(this.cveMovimiento, other.cveMovimiento)) {
            return false;
        }
        return Objects.equals(this.fecha, other.fecha);
    }
    
    //f. El método hashCode() que regresa el código Hash de una instancia de la clase.
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.cveMovimiento);
        hash = 71 * hash + Objects.hashCode(this.fecha);
        hash = 71 * hash + (this.procesado ? 1 : 0);
        return hash;
    }
    
    /*
    h.	Se debe asegurar en todas las situaciones donde aplique de lo siguiente: 
a.	La fecha del movimiento no puede ser mayor a la fecha actual.
    */
}
