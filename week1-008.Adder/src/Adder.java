
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        // C'EST LE CODE DE L'EXERCICE SUIVANT (DIVISION)
        System.out.print("Type a number: ");
        double chiffre1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        double chiffre2 = Integer.parseInt(reader.nextLine());
        System.out.println("Sum of the numbers: "+(chiffre1 + "+" + chiffre2 + "=" + (chiffre1+chiffre2)));
    }
}
