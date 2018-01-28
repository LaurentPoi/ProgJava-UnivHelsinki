import java.util.Scanner;

public class FirstCharacter {

    public static char firstCharacter(String text) {
        char character = text.charAt(0);
        System.out.println("la première lettre est  : "+character);
        return character;
    }
    
    public static void main(String[] args) {
        System.out.print("Entrez votre prénom : ");
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        firstCharacter(name);
    }
    
    
}

/* SOLUTION-TYPE
public class FirstCharacter {
    public static char firstCharacter(String text) {
        return text.charAt(0);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name ");
        String name = reader.nextLine();
        System.out.println("First character: " + firstCharacter(name));
    }
}
*/