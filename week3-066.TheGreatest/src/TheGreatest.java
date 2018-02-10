/*
Create the method greatest, 
which receives a list of numbers (ArrayList<Integer>) as a parameter 
and then returns 
the greatest number in the list as a return value
*/

import java.util.ArrayList;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        // write code here
        int greatest = Integer.MIN_VALUE;
        for (int item : list) {
            if (item >= greatest) {
                greatest = item;
                        }
        }
        return greatest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}
/*
SOLUTION-TYPE :
public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        // write code here
        // The first candidate for the greatest is the first in the list
        int greatestSoFar = list.get(0);
        // then we iterate over the whole list
        for (int luku : list) {
            // if a greater found, we take that as the candidate for greatest
            if (luku > greatestSoFar) {
                greatestSoFar = luku;
            }
        }
        return greatestSoFar;
    }
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        System.out.println("The greatest number is: " + greatest(lista));
    }
}
*/