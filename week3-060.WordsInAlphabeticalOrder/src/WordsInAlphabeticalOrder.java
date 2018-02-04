/*
Create a program that asks the user to input words, 
until the user gives an empty string. 
Create a similar program as the previous one, 
but in which the words are printed in alphabetical order.
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {
    
    
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> alpha = new ArrayList<String>();
        while (true) {
            System.out.print("Type something:");
            String smthing = reader.nextLine();
            if (smthing.equals("")) { 
                System.out.println("You typed the following words: ");
                Collections.sort(alpha);
                for (String hhh : alpha) {
                    System.out.println(hhh);
                }
                
                break;
            }else{
                alpha.add(smthing);
                
            }
        }
    }
}

/*
public class WordsInAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if (word.equals("")) {
                break
            }
            words.add(word);
        }
        Collections.sort(words);
        System.out.println("You typed the following words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
*/