
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int lim = reader.nextInt();
        int i=1, sum=0;
        
        while ( i <= lim) {
        sum = sum+i;
        i++;
        
    }
        System.out.println(sum);
    }
}
