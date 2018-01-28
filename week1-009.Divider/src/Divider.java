
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
         System.out.print("Type a number: ");
        double chiffre1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        double chiffre2 = Integer.parseInt(reader.nextLine());
        System.out.println("Division: "+(chiffre1 + "/" + chiffre2 + "=" + (chiffre1/chiffre2)));
    }
}
