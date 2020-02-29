package com.jaim.class21;

/**
 *
 * @author jaimg
 */
public class Libros {

    String nombre_libro;
    String autor;
    float precio;
    int unidades;

    public Libros() {
    }

    public Libros(String nombre_libro, String autor, float precio, int unidades) {
        this.nombre_libro = nombre_libro;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getNombre_libro() {
        return nombre_libro;
    }

    public void setNombre_libro(String nombre_libro) {
        this.nombre_libro = nombre_libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Libros: " + " nombre_libro: " + nombre_libro + ", su autor: " + autor + ", con un precio de: " + precio + " € y un numero de unidades: " + unidades;
    }
    
    public int compareTo(Object o) {
        Libros x = (Libros) o;
        if (this.nombre_libro.compareToIgnoreCase(x.nombre_libro) == 0) {
            return 0;
        } else if (this.nombre_libro.compareToIgnoreCase(x.nombre_libro) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}



