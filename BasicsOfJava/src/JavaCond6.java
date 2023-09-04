import java.util.Scanner;

public class JavaCond6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the marks:");
        int marks = scn.nextInt();

        if ( marks >= 40 ) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
