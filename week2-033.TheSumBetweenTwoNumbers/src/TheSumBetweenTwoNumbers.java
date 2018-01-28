
import java.util.Scanner;

public class TheSumBetweenTwoNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int f, l, sum=0;

        System.out.println("First: ");
        f = reader.nextInt();
        System.out.println("Last: ");
        l = reader.nextInt();

        while (f <= l) {
            sum = sum + f;
            f++; }
        System.out.println("The sum is "+sum);
        }
    }
