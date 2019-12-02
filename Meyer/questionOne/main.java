/**
 * main
 */
public class main {
    public static void main(String[] args) {
        MultiplicationTable multiplicationTable1 = new MultiplicationTable(3, 17, 25);
        MultiplicationTable multiplicationTable2 = new MultiplicationTable(17, 3, 49);
        MultiplicationTable multiplicationTable3 = new MultiplicationTable(0, 1, 5);

        multiplicationTable1.printTable();
        multiplicationTable2.printTable();
        multiplicationTable3.printTable();
    }
}