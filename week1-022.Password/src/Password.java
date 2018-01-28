
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        while (true) {

            System.out.print("Type the password: ");
            String pw = reader.nextLine();
            if (pw.equals(password)) {
                System.out.println("Right!");
                System.out.println("The secret is asdfdsacarrot");
                break;
            
                    } 
                System.out.println("Wrong!");
            }
        }

    }

/* SOLUTION :

        // Write your code here

        while (true) {

            System.out.print("Type the password: ");

            String readPassword = reader.nextLine();

 

            if (readPassword.equals(password)) {

                System.out.println("Right!");

                break;

            } else {

                System.out.println("Wrong!");

            }

        }

        System.out.println(""); 

        System.out.println("The secret is: jryy qbar!");
*/
