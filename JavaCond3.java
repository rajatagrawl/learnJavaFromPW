import java.util.Scanner;

public class JavaCond3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;

        System.out.println("Enter Cost Price:");
        int cp = scn.nextInt();
        System.out.println("Enter Selling Price:");
        int sp = scn.nextInt();

        int amt = sp - cp ;

        if ( amt >= 0) {
            System.out.println("Profit=" + amt);
        } else {
            amt*=-1;
            System.out.println("Loss=" + amt);
        }
    }
}
