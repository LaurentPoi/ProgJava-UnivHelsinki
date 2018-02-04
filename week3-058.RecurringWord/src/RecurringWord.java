/*
Create a program that asks the user to input words
until the user gives the same word twice.
Use an ArrayList structure in your program.
Hint: Remember that ArrayList has the method .contains()
*/
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
        System.out.print("Type in a word: ");
        String word = reader.nextLine();
        if (words.contains(word)) {
            System.out.println("you typed the word: "+word+" twice.");
            break;
            } else {
            words.add(word);
            System.out.println("boucle");
            }
        }
    }
}

