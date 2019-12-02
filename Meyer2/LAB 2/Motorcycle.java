/**
 * Motorcycle
 */
public class Motorcycle extends Vehicle{
    int speed;
    int time;
    int capacity;
    void accelerate(int speed){
        System.out.println("On average a motorcycle accelerates at "+speed+"km/hr");
    }
    void stop(int time){
        System.out.println("A motorcycle stops in "+time+"s");
    }
    void gas(int capacity){
        System.out.println("A motorcycle's gas tank capacity is "+capacity + "litres");
    }
    
}