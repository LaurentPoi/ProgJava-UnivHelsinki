
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int num1 = reader.nextInt();

        if (num1 >= 0 && num1 < 30) {
            System.out.println("Grade: failed");
        } else if (num1 >= 30 && num1 < 35) {
            System.out.println("Grade: 1");
        } else if (num1 >= 35 && num1 < 40) {
            System.out.println("Grade: 2");
        } else if (num1 >= 40 && num1 < 45 ) {
        System.out.println("Grade: 3");
        }else if (num1 >= 45 && num1 < 50) {
            System.out.println("Grade: 4");
            }else {
            System.out.println("Grade: 5");
        }
    }
}
