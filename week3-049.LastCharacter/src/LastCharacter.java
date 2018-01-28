import java.util.Scanner;


public class LastCharacter {

    public static char lastCharacter(String text) {
        return text.charAt(text.length()-1);
    }
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        System.out.println("Entrez votre prénom : ");
        System.out.println("La dernière lettre est : " + lastCharacter(name));
    }
}
// TEST GIT
