
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
 Account LP = new Account("Mon compte : ", 100.0);
        LP.deposit(20.0);
System.out.println(LP.toString());       
    }

}
/*
SOLUTION-TYPE :
public class Accounts {
    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account account = new Account("Barto's account", 100.0);
        account.deposit(20);
        System.out.println(account);
    }
}
*/