import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = scn.nextInt();

        int a = 1;
        int b = 1;

        for(int i=1; i<=num; i++) {
            System.out.print(a + " ");
            int sum = a + b ;
            a = b ;
            b = sum ;

        }
    }
}
