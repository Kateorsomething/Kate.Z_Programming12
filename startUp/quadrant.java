import java.util.Scanner;
public class quadrant {

    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String quadrant;
        System.out.println("enter x");
        double x = input.nextDouble();
        System.out.println("enter y");
        double y = input.nextDouble();


        if (x > 0) {
            if (y > 0) {
                quadrant = "1";
            } else if (y < 0) {
                quadrant = "4";
            } else {
                quadrant = "none";
            }
        } else if (x < 0) {
            if (y > 0) {
                quadrant = "2";
            } else if (y < 0) {
                quadrant = "3";
            } else {
                quadrant = "none";
            }
        } else {
            quadrant = "none";
        }

        System.out.println("Quadrant " + quadrant);

    }
}
