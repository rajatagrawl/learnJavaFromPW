import java.util.Scanner;

public class JavaCond2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = scn.nextInt();

        if ( num < 0 ) {
            num = num * -1 ;
        }

        System.out.println("Absolute Value:" + num);
    }
}
