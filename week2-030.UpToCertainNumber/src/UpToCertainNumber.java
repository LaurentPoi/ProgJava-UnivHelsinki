
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int lim, i = 1;
        System.out.print("Up to what number? ");
        lim = reader.nextInt();
        
        while (i <= lim) {
            System.out.println(i);
            i+=1;
        }
        
    }
}
