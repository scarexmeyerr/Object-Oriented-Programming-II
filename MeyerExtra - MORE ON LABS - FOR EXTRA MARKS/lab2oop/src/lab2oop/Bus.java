/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2oop;

/**
 *
 * @author LUCY
 */
public class Bus extends Vehicle{

    @Override
    public void accelerate() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String accelerate = "30 kilometers per minute";
    System.out.println("The bus accelerates at "+accelerate);
    }

    @Override
    public void gas() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    int fullGas=200;
    System.out.println("The gas tank has a full capacity of "+fullGas+" litres");
    }

    @Override
    public void stop() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int BrakeDistance=40;  
    System.out.println("A bus brakes after a distance of "+BrakeDistance+" metres");
    }
    
}
