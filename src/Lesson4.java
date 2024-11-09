import java.util.Scanner;

public class Lesson4 {

    public void doFor(){
        int sum = 0;
        int factorial = 1;
        double what = 1;

//        for (int i = 0; i < 10; i ++){
//            System.out.println(i);
//        }
//        for (int i = 0, j = 0; i < 10 || j < 10; i ++, j +=2){
//            System.out.println(i + " " + j);
//        }
//        for (;;){
//            System.out.println("Hello");
//        }
//        for (int i = 0; i < 10; i++){
//            if (i == 5)
//                continue; // break: ends the for-loop
//            // continue: skips this number in the for loop (goes back to the next value in the for loop)
//            System.out.println(i);
//        }
//        for (int i = 1; i <= 10; i++){
//            factorial *= i;
//            sum += i;
//            what += 1.0/(i);
//        }
//        System.out.println(factorial);
//        System.out.println(sum);
//        System.out.println(what);

        System.out.println("Pattern D");
        for (int rows = 0; rows < 6; rows++) {				// Print rows
            for (int ws = 0; ws < rows; ws++) {				// Print white space
                System.out.print("  ");
            }
            for (int col = 0; col < 6 - rows; col++) {	// Print numbers
                System.out.print((col + 1) + " ");
            }
            System.out.println();								// Print newline
        }

        for (int rows = 1; rows <= 9; rows ++){
            for (int col = 1; col <= rows; col++){
                System.out.print(col + " * " + rows + " = " + col * rows + " ");
            }
            System.out.println();
        }

    }

    public void doWhile(){
        int count = 10;
        while (count >= 0){
            count--;
            if (count == 5)
                break;
            System.out.println(count);
        }

        Scanner input = new Scanner(System.in);
        //System.out.println("Please input an int: ");
        int a = 0;

        do {
            System.out.println("Please input 0");
            a = input.nextInt();
        }
        while (a != 0);
    }
}
