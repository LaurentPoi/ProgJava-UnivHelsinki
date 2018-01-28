
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        
        // program your solution here. Do not touch the above lines!
        
        int essai = 1000;
        int n = 0;
        while (numberDrawn != essai){
            System.out.println("Guess a number: ");
            n+=1;
            essai = reader.nextInt();
            if (essai == numberDrawn) { System.out.println("Congratulation, your guess is correct!");}
            else if (essai > numberDrawn){ System.out.println("The number is lesser, guesses made: "+n);}
            else if (essai < numberDrawn) {System.out.println("The number is greater, guesses made: "+n);
            }
        }
    }
    
    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
