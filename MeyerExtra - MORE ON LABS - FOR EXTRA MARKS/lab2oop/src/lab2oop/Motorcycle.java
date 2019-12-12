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
public class Motorcycle extends Vehicle{

    @Override
    public void accelerate() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String accelerate = "50 kilometers per minute";
    System.out.println("The motorcycle accelerates at "+accelerate);
    }

    @Override
    public void gas() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    int fullGas=10;
    System.out.println("The gas tank full capacity is "+fullGas);
    }

    @Override
    public void stop() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    int BrakeDistance=20;
    System.out.println("A motorcycle brakes after a distance of "+BrakeDistance+" metres");
    }
    
}
