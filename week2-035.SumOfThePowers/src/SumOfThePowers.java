
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int n = reader.nextInt();
        int result = 0;

        int number = 0;
        while (number <= n) {

            int var = (int) Math.pow(2, number);
            number++;
            result += var;

        }
        System.out.println("The result is " + (result));
    }
}
