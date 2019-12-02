/**
 * Sedan
 */
public class Sedan extends Vehicle implements Automobile {
   int speed;
    int gear;
    int increment;
    int time = 3;
    int capacity = 20;
    Boolean engineState;

    //Method Overloading is shown by the constructor
    Sedan(Boolean engineState, int speed, int gear, int increment){
        this.engineState = engineState;
        this.speed = speed;
        this.gear = gear;
        this.increment = increment;
    }

    Sedan(Boolean engineState){
        this.engineState = engineState;
        this.speed = 0;
        this.gear = 1;
        this.increment = 30;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @param gear the gear to set
     */
    public void setGear(int gear) {
        this.gear = gear;
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * @return the gear
     */
    public int getGear() {
        return this.gear;
    }

    @Override
    public void startEngine(Boolean engineState){
        this.engineState = engineState;
        if (engineState) {
            System.out.println("The engine is already on");
        } else {
            engineState = true;
            System.out.println("The engine is on now");
        }
    }

    @Override
    public void stopEngine(Boolean engineState){
        this.engineState = engineState;
        if (engineState) {
            engineState = false;
            System.out.println("The engine is now off");
        } else {
            System.out.println("The engine is already off");
        }
    }

    @Override
    public void changeGear(int newGear){ 
        System.out.println((newGear > 0 && newGear<7) ? "The gear has changed to "+ newGear + " from " + this.gear : "The gear has not changed");
        this.gear = newGear;
        this.gear = ((newGear > 0 && newGear<7) ? newGear : this.gear); 
    } 

    @Override
    public void speedUp(int increment){
        this.increment = increment;
        this.speed = increment + this.speed;
        System.out.println("The speed has increased by "+increment+" and is now at "+this.speed);
    }

     //The methods of abstract class Vehicle
    void accelerate(int speed){
        this.speed = speed;
        System.out.println("The vehicle has accelerated by "+speed+" km/hr");
    }

    void stop(int time){
        this.time = time;
        System.out.println("The Vehicle stopped after "+time+"s");
    }

    void gas(int capacity){
        this.capacity = capacity;
        System.out.println("The Vehicle's fuel capacity is "+capacity+" litres");
    }

    public void display(){
        System.out.println("<----------- RESULTS ---------------->");
        startEngine(this.engineState);
        changeGear(this.gear);
        speedUp(this.increment);
        stopEngine(this.engineState);
        System.out.println("<----------- END RESULTS ---------------->");
    }
    
}