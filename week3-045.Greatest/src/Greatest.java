
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int tmp = 0;
        if (number1 > number2 && number1 > number3) {tmp = number1;}
        else if (number2 > number1 && number2 > number3) {tmp = number2;}
        else {tmp = number3;}
            

        return tmp;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
/*
SOLUTION-TYPE :

    public static int greatest(int number1, int number2, int number3) {

        int greatest = number1;

        if (number2 > greatest) {

            greatest = number2;

        }

        if (number3 > greatest) {

            greatest = number3;

        }

        return greatest;
*/