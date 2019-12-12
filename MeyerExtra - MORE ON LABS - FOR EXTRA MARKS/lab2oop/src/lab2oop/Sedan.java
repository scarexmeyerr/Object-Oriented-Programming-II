/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2oop;

import java.util.Scanner;

/**
 *
 * @author LUCY
 */
public class Sedan extends Vehicle implements Automobile{
    Scanner input=new Scanner(System.in);
    String name="Sedan";

    @Override
    public void accelerate() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    System.out.println("Enter the model to know its acceleration");
    String model=input.next();
    
    if(model.equalsIgnoreCase("001A")){  
    double  acceleration=2000;
    System.out.println("The acceleration of the "+model+" "+name+" model is "+ acceleration/20+" kilometers per hour ");
    }
        
    if(model.equalsIgnoreCase("002B")){  
    double  acceleration=2500;
    System.out.println("The acceleration of the "+model+" "+name+" model is "+ acceleration/15+" kilometers per hour ");
    }
        
    if(model.equalsIgnoreCase("003C")){  
    double acceleration=3000;
    System.out.println("The acceleration of the "+model+" "+name+" model is "+ acceleration/10+" kilometers per hour ");
    }   
    }

    @Override
    public void gas() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    int gasUtilization=2;
    System.out.println("A "+name+" uses "+gasUtilization+" litres per kilometer");
    }

    @Override
    public void stop() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    int BrakeDistance=30;
    System.out.println("A "+name+" brakes after a distance of "+BrakeDistance+" metres");
    }

    @Override
    public void maxSpeed() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    int max=360;
    System.out.println("The best model of a "+name+" has a maximum speed of "+max);
    }

    @Override
    public void minSpeed() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    int min=180;
    System.out.println("The slowest model of a "+name+" has a maximum speed of "+min);
    }

    @Override
    public void horsepower() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    int horsePower=2000;
    System.out.println("The horsepower of the "+name+" model is "+horsePower);
    }
    
}
