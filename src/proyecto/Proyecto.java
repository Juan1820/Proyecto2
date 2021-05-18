/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author juanp
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Cuadrado cuadrado = new Cuadrado(0,0,4,0,0);
      //cuadrado.datos();
      cuadrado.Area();
      Rectangulo rectangulo = new Rectangulo(0, 6, 8, 0, 0);
      //rectangulo.Datos();
      rectangulo.Area();
      Trapecio trapecio = new Trapecio(3, 0, 9, 0, 4, 0);
      //trapecio.Datos();
      trapecio.Area();
    }

    
    
}
