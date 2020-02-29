package com.jaim.class21;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jaimg
 */
public class Fichero {

    PrintWriter esc = null;
    FileWriter fich;
    Scanner sc;

    public void escribirFichero(String nombreFich, ArrayList<Libros> lista) {

        try {
            fich = new FileWriter(nombreFich); //para añadir ...(fich,true)
            esc = new PrintWriter(fich);

            for (int i = 0; i < lista.size(); i++) {

                esc.println(lista.get(i).toString());

            }

        } catch (IOException ex) {
            System.out.println("Error escritura " + ex.getMessage());

        } finally {
            esc.close();
        }
    }

    public void borrarFichero(File fichero) {
        if (!fichero.exists()) {
            System.out.println("El fichero no existe.");
        } else {
            fichero.delete();
            System.out.println("El fichero ha sido eliminado");
        }
    }

    public void leerLineas(File fichero) {
        try {
            sc = new Scanner(fichero);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException ex) {
            System.out.println("error linea: " + ex.toString());
        }

    }
    
}
