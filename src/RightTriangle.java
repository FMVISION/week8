import java.util.Scanner;

public class RightTriangle {/*
8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@ */

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter Right Angled Triangle pattern Rows = ");
        int rows = sc.nextInt();

        System.out.println("Printing Right Angled Pattern");
        for (int i = 1; i <= rows; i++){
            for (int j = 1 ; j<= 1; j++){
                System.out.println("@");
            }
            System.out.println();
        }
    }
}
