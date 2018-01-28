
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
         System.out.print("Type a number: ");
        int chiffre1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int chiffre2 = Integer.parseInt(reader.nextLine());
        int chiffre3 = Math.max(chiffre1, chiffre2);
        System.out.println("The bigger number of the two numbers given was: " + chiffre3);
    }
}
