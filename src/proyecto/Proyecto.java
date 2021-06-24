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
      Cuadrado cuadrado = new Cuadrado(4,4,4,4);
      //cuadrado.datos();
      cuadrado.Area();
      Rectangulo rectangulo = new Rectangulo( 2, 4, 4, 2);
      //rectangulo.Datos();
      rectangulo.Area();
      Trapecio trapecio = new Trapecio( 2, 3, 2, 3);
      //trapecio.Datos();
      trapecio.Area();
    }

    
    
}
