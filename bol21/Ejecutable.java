package com.jaim.bol21;

import com.jaim.class21.*;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jaimg
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Libros> listaLibros = new ArrayList();
        Libros libro1 = new Libros("As", "Pablo", 9.99f, 15);
        listaLibros.add(libro1);
        Libros libro2 = new Libros("The best", "Jaime",19.99f, 25);
        listaLibros.add(libro2);
        Libros libro3 = new Libros("Slam", "Pedro",5.00f, 20);
        listaLibros.add(libro3);
        Fichero f = new Fichero();
        f.escribirFichero("Libreria.txt", listaLibros);
        int opcion;
        Metodos obj = new Metodos();
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("   MENÚ:  \n1--> Añadir libro\n2--> Mostrar libros \n3-->Borrar libros con cero unidades"
                    + "\n4-->Consultar libro\n5-->Modificar el precio de un libro \n6-->Salir"));
            switch (opcion) {
                case 1:
                    listaLibros.add(obj.crearLibro());
                    f.escribirFichero("Libreria.txt", listaLibros);
                    break;
                case 2:
                    obj.mostrar(listaLibros);
                    break;
                case 3:
                    obj.borrarLibro(listaLibros);
                    File fich = new File("Libreria.txt");
                    f.borrarFichero(fich);
                    f.escribirFichero("Libreria.txt", listaLibros);
                    break;
                case 4:
                    obj.consultarLibro(listaLibros);
                    break;
                case 5:
                    obj.modificarPrecioLibro(listaLibros);
                    File fich2 = new File("Libreria.txt");
                    f.borrarFichero(fich2);
                    f.escribirFichero("Libreria.txt", listaLibros);
                    break;
                case 6:
                    obj.salir();
                    break;
            }

        } while (opcion < 6);
        
        System.out.println("La opción tiene que ser < 6. Vuleva a iniciar el programa.");
                
    }
    
}
























