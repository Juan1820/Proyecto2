/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author juanp
 */
public abstract  class Cuadrilatero {
    double V1,V2,V3,V4;

    public Cuadrilatero(double V1, double V2, double V3, double V4) {
        this.V1 = V1;
        this.V2 = V2;
        this.V3 = V3;
        this.V4 = V4;
    }

   

    public double getV1() {
        return V1;
    }

    public void setV1(double V1) {
        this.V1 = V1;
    }

    public double getV2() {
        return V2;
    }

    public void setV2(double V2) {
        this.V2 = V2;
    }

    public double getV3() {
        return V3;
    }

    public void setV3(double V3) {
        this.V3 = V3;
    }

    public double getV4() {
        return V4;
    }

    public void setV4(double V4) {
        this.V4 = V4;
    }


    
    
  
public abstract void Area();
    
    }
    
    
    
    
    

