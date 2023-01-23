import java.io.File;
import java.util.Scanner;

public class happyOrSad {

    public static void main (String[] args) {
        int happyCount = 0;
        int sadCount = 0;

        //pass first line of txt into text variable
        File file = new File("happyorsad.txt");
        Scanner scanner = new Scanner("");
        try {
            scanner = new Scanner(file);
        } catch (java.io.FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        String text = scanner.nextLine();

        //happy & sad counter
        int i = 0;
        while (text.indexOf(":-)",i) != -1 ) {
            happyCount ++;
            i = text.indexOf(":-)",i)+3;
        }

        i = 0;
        while (text.indexOf(":-(",i) != -1 ) {
            sadCount ++;
            i = text.indexOf(":-(",i)+3;
        }

        //compare & print
        if (sadCount == happyCount) {
            if (sadCount == 0) {
                System.out.println("none");
            } else {
                System.out.println("unsure");
            }
        } else {
            if (sadCount > happyCount) {
                System.out.println("sad");
            } else {
                System.out.println("happy");
            }
        }

    }
}
