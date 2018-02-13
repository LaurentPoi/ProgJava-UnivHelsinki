
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account A = new Account ("A", 100);
        Account B = new Account ("B", 0);
        Account C = new Account ("C", 0);
        
        transfer(A, B, 50);
        transfer(B, C, 25);
    }
    
    public static void transfer(Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
        
    }


}
/*
SOLUTION-TYPE :
    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account tiliA = new Account("tili A", 100.0);
        Account tiliB = new Account("tili B", 0.0);
        Account tiliC = new Account("tili C", 0.0);
        transfer(tiliA, tiliB, 50);
        transfer(tiliB, tiliC, 25);
    }
    public static void transfer(Account form, Account to, double amount) {
        form.withdrawal(amount);
        to.deposit(amount);
    }
}
*/