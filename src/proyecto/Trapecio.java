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

    public Trapecio(double h, double area, double V1, double V2, double V3, double V4) {
        super(V1, V2, V3, V4);
        this.h = h;
        this.area = area;
    }

  

    public void Datos(){
    Scanner leer = new Scanner(System.in);
         System.out.println("Cual es elvalor de la base Mayor");
        this.V1=leer.nextDouble();
        System.out.println("Cual es elvalor de la base menor");
        this.V3=leer.nextDouble();
        System.out.println("Cual es elvalor de la altura");
        h=leer.nextDouble();
    }

    @Override
    public void Area() {
        System.out.println("Area del Trapecio");
        
        if(this.V1!=this.V3){
       area=(this.V1+this.V3)*(h)/2;
       
        System.out.println("El area del trapecio es de "+ area);
        }
        else{
            System.out.println("La figura no es un trapecio vuelve a intentar");
        }
    }
    
    
    
}
