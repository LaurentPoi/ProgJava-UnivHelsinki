/* Create the method average, which receives a list of numbers 
(ArrayList<Integer>) as a parameter 
and then calculates the average of the items in that list.
*/

// Note: the method should use the method sum from the previous exercise to calculate the sum of the parameters.
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        int som = 0;
        for ( int item : list) {som+=item;}
        return som;
    }
    

    public static double average(ArrayList<Integer> list) {
        // write code here
        double lon = (list.size());
        double res = (sum (list))/lon;
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}

/*
SOLUTION-TYPE :

public class AverageOfNumbers {
    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum = sum + number;
        }
        return sum;
    }

    public static double average(ArrayList<Integer> list) {
        // write code here
        // first the sum of variables is calculated and saved in double variable
        double sum = (double) sum(list);
        // average is then easy to get with dividing sum by the list length
        return sum / list.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        System.out.println("The average is: " + average(list));
    }
}
*/