
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int res=1, a=1, lim = reader.nextInt();

        while (a <= lim) {
            
            res *= a ;
            
            a++;
            
            //res = 1*2*3*4...*lim
          
            
        }

        System.out.println("Factorial is: " +res);

    }
}
