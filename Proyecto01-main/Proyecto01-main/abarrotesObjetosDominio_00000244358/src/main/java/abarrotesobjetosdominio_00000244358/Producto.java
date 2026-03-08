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
public class Producto {

    protected String clave;
    protected String nombre;
    protected char tipo;
    protected String unidad;

    //Constructor por defecto
    public Producto() {
    }

    //Constructor que inicializa los atributos
    public Producto(String clave, String nombre, char tipo, String unidad) {
        this.clave = clave;
        this.nombre = nombre;
        this.tipo = tipo;
        this.unidad = unidad;
    }

    //Constructor de copia(????)
    
    
    
    //Gets y sets para cada uno de los atributos
    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public char getTipo() {
        return tipo;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

   /*Método equals() que compara este producto con el objeto del parámetro. El método regresa verdadero 
    si el objeto del parámetro es de la clase Producto y ambos tienen la misma clave, falso en caso contrario.
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
        final Producto other = (Producto) obj;
        if (this.tipo != other.tipo) {
            return false;
        }
        if (!Objects.equals(this.clave, other.clave)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.unidad, other.unidad);
    }

    //Método hashCode()
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.clave);
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + this.tipo;
        hash = 89 * hash + Objects.hashCode(this.unidad);
        return hash;
    }

    /*Método toString() que regresa una cadena con los valorez de los atributos de la clase.
    Los valores de los atributos irán separados por comas sin saltos de línea u otra información adicional.
    */

    @Override
    public String toString() {
        return "Producto{" + "clave=" + clave + ", nombre=" + nombre + ", tipo=" + tipo + ", unidad=" + unidad + '}';
    }
    
}
