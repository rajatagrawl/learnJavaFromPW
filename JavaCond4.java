import java.util.Scanner;

public class JavaCond4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = scn.nextInt();

        if ( num >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("The number is negative and skipped");
        }
    }
}
