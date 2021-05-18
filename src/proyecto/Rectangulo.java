/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author juanp
 */
public class Rectangulo extends Cuadrilatero{
    private double area;

    public Rectangulo(double area, double V1, double V2, double V3, double V4) {
        super(V1, V2, V3, V4);
        this.area = area;
    }


   public void Datos(){
   
        Scanner leer = new Scanner(System.in);
        System.out.println("Cual es el valor de la base ");
        this.V1= leer.nextDouble();
        System.out.println("Cuaal es el valor de la altura");
        this.V2 = leer.nextDouble();
   }

    @Override
    public void Area() {
        System.out.println("Area del Rectangulo");
        if(this.V1!=this.V2) {
            area = this.V1*this.V2;
            
            System.out.println("El area del rectangulo es de "+ area);
        }
        else {
            System.out.println("La figura no es un rectangulo vuelva a intentar ");
        }
    }
    
    
    
}
