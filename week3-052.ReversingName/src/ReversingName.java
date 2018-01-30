/*
Create a program that asks for the user's name and prints it in reverse order.
You do not need to create a separate method for this.
*/
import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Entrez votre prénom : ");
        String name = reader.nextLine();
        ;
        System.out.print("à l'envers : ");
        for (int i=name.length()-1; i>=0; i--) {
            System.out.print(name.charAt(i) );
            
        }
    }
}
/*
public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.print("In reverse order: ");
        int i = name.length() - 1;
        while (i >= 0) {
            System.out.print(name.charAt(i));
            i--;
        }
       System.out.println("");
    }
}
*/