
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account Matt = new Account ("Matt's account", 1000.0);
        Account My = new Account ("My account", 0);
        My.deposit(100);
        Matt.withdrawal(100.0);
        System.out.println(My.toString());
        System.out.println(Matt.toString());
    }

}

/*
SOLUTION-TYPE :
public class Accounts {
    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account accoutOfMatt = new Account("Matt's account", 1000.0);
        accoutOfMatt.withdrawal(100);
        Account myAccount = new Account("My account", 0.0);
        myAccount.deposit(100);
        System.out.println(accoutOfMatt);
        System.out.println(myAccount);
    }
}
*/