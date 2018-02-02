/*
Create a program that asks the user to input words until 
the user types in an empty String. 
Then the program prints the words the user gave. 
Try the for repetition sentence here.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        
        String word = "azer";
        while (true) {
            System.out.print("Type in a word or hit return to stop: ");
            word = reader.nextLine();
            if (word.length()<1){
                System.out.println("You typed: ");
                for (String wird : words) {
                    System.out.println(wird);}
                break;
            } else {
                words.add(word);
                    }
            
            }
        }
        
    }

/*
SOLUTION-TYPE

public class Words {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if (word.equals("")) {
                break;
            }
            words.add(word);
        }
        System.out.println("You typed the following words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
*/