import java.util.Scanner;

public class JavaOp3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int sum = 0;
        while ( x > 0) {
            int digit = x % 10 ;
            x = x / 10 ;
            sum = sum + digit ;
        }

        System.out.println(sum);
    }
}
