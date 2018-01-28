public class PrintingLikeBoss {
    
    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        
        /* Reprise de la solution suggérée, pas ma solution du 39 */
        int printed = 0;
        while (printed < amount) {
            System.out.print("*");
            printed = printed + 1;
        }
        System.out.println("");
    }
    
    /* boucle for
    int i = 0;
    for (i = 0; i < amount; i++) {
    System.out.print("*");
    }
    System.out.print("\n");
    */
    
    public static void printWhitespaces(int amount) {
        // 40.1
        int printWhite = 0;
        while (printWhite < amount) {
            
            System.out.print(" ");
            
            printWhite += 1;
            
        }
    }
    
    public static void printTriangle(int size) {
        // 40.2
        int i = 1;
        int ws ;
        for (i=1 ; i<= size; i+=1) {
            ws = size - i;
            printWhitespaces(ws);
            printStars(i);
        }
    }
    
    public static void xmasTree(int height) {
        // 40.3
        int i = 1; int j = 1;
        for (i=1 ; i<= height; i+=1) {
            printWhitespaces(height-i);
            printStars(j); j+=2;
        }
         int k = 0;
        while (k < 2){
            printWhitespaces(height-2);
            printStars(3);
            k++;
}
    }
    
    public static void main(String[] args) {
        // Tests do not use main, you can write code here freely!
        
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
        
        
        
    }
}
