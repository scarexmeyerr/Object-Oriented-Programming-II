/**
 * Building
 */
public class Building {

    public String name;
    public int floors;
    public int noOfRooms;
    public String color;

    public Building(String name, int floors, int noOfRooms, String color){
        this.name = name;
        this.floors = floors;
        this.noOfRooms = noOfRooms;
        this.color = color;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param floors the floors to set
     */
    public void setFloors(int floors) {
        this.floors = floors;
    }
    
    /**
     * @param noOfRooms the noOfRooms to set
     */
    public void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return the floors
     */
    public int getFloors() {
        return this.floors;
    }

    /**
     * @return the noOfRooms
     */
    public int getNoOfRooms() {
        return this.noOfRooms;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return this.color;
    }

    public void printReport() {
        System.out.println(this.name + " is a " + this.color + " building and has " + this.noOfRooms + " rooms.");
    }
}