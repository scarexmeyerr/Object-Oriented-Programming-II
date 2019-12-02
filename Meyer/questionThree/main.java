/**
 * main
 */
public class main {

    public static void main(String[] args) {
        // Create an array to store objects of class Building
        Building building[] = new Building[5];
        //Populate the array
        building[0] = new Building("MSB",3,4,"white");
        building[1] = new Building("STM",5,4,"white");
        building[2] = new Building("SBS",6,4,"blue");
        building[3] = new Building("SLS",2,5,"red");
        building[4] = new Building("FIT",1,8,"white");
        //Invoking display method on each object in the array
        System.out.println("<---------- Start of Report ------------>");
        System.out.println(" ");
        for(int i = 0; i<building.length; i++) {
            building[i].printReport();
            System.out.println(" ");
        }
        System.out.println("<---------- End of Report ------------>");
    }
}