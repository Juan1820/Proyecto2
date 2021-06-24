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
    private double L1,L2,L3,L4;

    public Cuadrado(double area) {
        this.area = area;
        this.L1 = L1;
        this.L2 = L2;
         this.L3 = L3;
        this.L4 = L4;
    }

    public Cuadrado( double X1, double X2, double Y1, double Y2) {
        super(X1, X2, Y1, Y2);
        this.area = area;
        this.L1 = L1;
        this.L2 = L2;
         this.L3 = L3;
        this.L4 = L4;
    }

    @Override
    public void Area() {
        System.out.println("Area del Cuadrado");
        L1=X1+X2;
        L2=X1+Y1;
        L3=X2+Y2;
        L4=Y2+Y1;
        if(L1==L2&&L2==L3&&L3==L4){
        area=L1*L2;
            System.out.println("El Area del cuadrado es de "+ area);
        }
        else{
        area=L1*L2;
            System.out.println("El Area de la figura es de "+ area +" Pero no es un cuadrado");
        }
        
    }

    
    
    
    
    
    
    
}
