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
public class Cuadrado extends Cuadrilatero{
    private double area;

    public Cuadrado(double area, double V1, double V2, double V3, double V4) {
        super(V1, V2, V3, V4);
        this.area = area;
    }

    
    
    public void datos(){
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Cual es el valor de un lado del cuadrado");
        this.V1=leer.nextDouble();
       
    }
    
    @Override
    public void Area(){
        
        System.out.println("Area del Cuadrado");        
        area = this.V1*this.V1;
        area = this.V2*this.V2;
        area = this.V3*this.V3;
        area = this.V4*this.V4;
        
        System.out.println("El area del cuadrado es de "+ area);
    
    
    
    
}
}