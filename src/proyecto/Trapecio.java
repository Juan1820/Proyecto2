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
public class Trapecio extends Cuadrilatero{
    private double h,area;
    private double L1,L2;

    public Trapecio(Trapecio h, Trapecio area) {
        h = h;
        area = area;
        this.L1 = L1;
        this.L2 = L2;
    }

    public Trapecio( double X1, double X2, double Y1, double Y2) {
        super(X1, X2, Y1, Y2);
        h = h;
        area = area;
        this.L1 = L1;
        this.L2 = L2;
    }


    @Override
    public void Area() {
        System.out.println("Area del Trapecio");
        L1=X1+Y1;
        L2=X2+Y2;
        h=Y1+Y2;
                
        if(L1<L2){
       area=(L1+L2)*(h)/2;
       
        System.out.println("El area del trapecio es de "+ area);
        }
        else{
            System.out.println("La figura no es un trapecio vuelve a intentar");
        }
    }
    
    
    
}
