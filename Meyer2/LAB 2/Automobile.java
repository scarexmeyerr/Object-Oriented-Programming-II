/**
 * Automobile
 */
public interface Automobile {
    public void startEngine(Boolean engineState);
    public void stopEngine(Boolean engineState);
    public void changeGear(int newGear);
    public void speedUp(int incrrement);
}