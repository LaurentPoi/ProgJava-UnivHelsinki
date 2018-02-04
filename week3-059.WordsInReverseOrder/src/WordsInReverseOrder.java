/*Create a program that asks the user to input words, 
until the user gives an empty string. 
Then the program prints the words the user gave in reversed order,
the last word is printed first etc.
*/

import java.util.*;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
        System.out.println("Type in a word or hit return to stop: ");
        String userword = reader.nextLine();
        if (userword.length() == 0) {
            System.out.println("you typed the following words: ");
            Collections.reverse(words);
            for (String wird : words) {System.out.println(wird);}
            break;
        } else {
            words.add(userword);
        }
    }
}
}

/*
SOLUTION-TYPE

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // create here an ArrayList

        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if (word.equals("")) {
                break;
            }
            words.add(word);
        }
        Collections.reverse(words);    
        System.out.println("You typed the following words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

*/