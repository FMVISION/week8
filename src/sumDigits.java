import java.util.Scanner;

public class sumDigits {
    /*
    Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910


     */

    public static void main(String[] args) {
        int i,j = 0,n;

        System.out.println("Input number of rows 10 : ");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();

        for (i=1;1<=n1;i++) {
         for (i=1;1<=j;i++)
              System.out.println(j);
            System.out.println(" ");
       }
    }

}
