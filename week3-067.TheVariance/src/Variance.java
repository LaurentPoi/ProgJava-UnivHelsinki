/*
Create the method variance, 
which receives a list of integers as a parameter 
and then returns the sample variance of that list. 

You can check how a sample variance is calculated in Wikipedia, 
under "Population variance and sample variance".

Note: the method should use the method average of exercise 64 to calculate 
the average of the parameters. 
The method should be called only once!
*/

import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int som = 0;
        for (int so : list) { som += so ;}
        return (som);
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return (sum(list)*1.0)/(list.size());
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        
        double average = average(list);
        double var = 0, total = 0;
        for (int num : list) {
        var = Math.pow((num * 1.0 - average), 2);
            total += var;
        }
        total = total / (list.size() - 1);
        return total;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
/*
SOLUTION-TYPE :

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum = sum + number;
        }
        return sum;
    }
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double sum = (double) sum(list);
        return sum / list.size();
    }
    public static double variance(ArrayList<Integer> list) {
        // write code here
        double aver = average(list);
        double var = 0;
        for (int number : list) {
            double difference = number - aver;
            double squareOfDifference = difference * difference;
            var = var + squareOfDifference;
        }
        var = var / (list.size() - 1);
        return var;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        System.out.println("The variance is: " + variance(list));
    }
}
*/