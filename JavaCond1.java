import java.util.Scanner;

public class JavaCond1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the length");
        int len = scn.nextInt();
        System.out.println("Enter the breadth");
        int breadth = scn.nextInt();

        if (len == breadth) {
            System.out.println("It is a square");
        }
        else {
            System.out.println("It is a rectangle");
        }
    }
}
