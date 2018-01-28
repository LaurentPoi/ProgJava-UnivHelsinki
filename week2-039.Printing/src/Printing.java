
public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times 
        int i = 0;
        /*while (true) {
            
            System.out.println("*");
            i++;
            if (i <= amount) break ;
         */

        for (i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int j;
        for (j = 0; j < sideSize; j += 1) {
            printStars(sideSize);
        }
        System.out.println("");
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int k;
        for (k = 0; k < height; k++) {

            printStars(width);

        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int l;
        for (l = 1; l <= size; l++) printStars(l);
    }

    public static void main(String[] args) {
        // Tests do not use main, you can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
