/**
 * main
 */
public class main {

    public static void main(String[] args) {
        Sedan sedan1 = new Sedan(false, 50, 2, 120);
        Sedan sedan2 = new Sedan(false);

        sedan1.display();
        System.out.println();
        sedan2.display();
    }
}