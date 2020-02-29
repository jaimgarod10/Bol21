package com.jaim.class21;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author jaimg
 */
public class Metodos {

    public Libros crearLibro() {

        Libros libro = new Libros(JOptionPane.showInputDialog("Nombre del libro: "), JOptionPane.showInputDialog("Autor: "), Float.parseFloat(JOptionPane.showInputDialog("Precio: ")), Integer.parseInt(JOptionPane.showInputDialog("Numero Unidades: ")));
        System.out.println("Libro añadido. ");
        return libro;
    }

    public void mostrar(ArrayList<Libros> lista) {
        if (lista.isEmpty()) {
            throw new NullPointerException("Error. El ArrayList está vacío");

        } else {
            System.out.println("Mostrar :");
            Iterator it = lista.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }

    public void borrarLibro(ArrayList<Libros> lista) {

        if (lista.isEmpty()) {
            throw new NullPointerException("Error. El ArrayList está vacío");

        } else {

            int contador = 0;
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(j).unidades == 0) {
                    contador++;
                }
            }

            if (contador == 0) {
                System.out.println("No hay libros con 0 unidades");
            }
            for (int k = 0; k < contador; k++) {
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).unidades == 0) {
                        lista.remove(lista.get(i));
                        System.out.println("Libro borrado.");
                    }
                }
            }
        }
    }

    public void consultarLibro(ArrayList<Libros> lista) {

        if (lista.isEmpty()) {
            throw new NullPointerException("Error. El ArrayList está vacío");

        } else {
            String tit = JOptionPane.showInputDialog("Introduce el titulo del libro: ");
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).nombre_libro.equals(tit)) {
                    System.out.println("El libro buscado es: \n" + lista.get(i));
                }
            }

        }
    }

    public void modificarPrecioLibro(ArrayList<Libros> lista) {

        if (lista.isEmpty()) {
            throw new NullPointerException("Error. El ArrayList está vacío");

        } else {
            String tit = JOptionPane.showInputDialog("Introduce el titulo del libro: ");
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).nombre_libro.equals(tit)) {
                    System.out.println("El precio del libro es de: " + lista.get(i).precio + "€");
                    String p = JOptionPane.showInputDialog("Introduce el nuevo precio del libro: ");
                    lista.get(i).precio = Float.parseFloat(p);
                    System.out.println("El precio fue modificado correctamente.");
                    break;
                }
            }
        }
    }

    public void salir() {
        System.exit(0);

    }
}


