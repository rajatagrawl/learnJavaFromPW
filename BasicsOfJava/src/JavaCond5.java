import java.util.Scanner;

public class JavaCond5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double ans;
        System.out.println("Enter an operator:");
        char op = scn.next().charAt(0);
        System.out.println("Enter 2 numbers:");
        double a = scn.nextDouble();
        double b = scn.nextDouble();

        switch (op) {
            case '+':
                ans = a + b ;
                System.out.println(ans);
                break;
            case '-':
                ans = a - b ;
                System.out.println(ans);
                break;
            case '*':
                ans = a * b ;
                System.out.println(ans);
                break;
            case '/':
                ans = a / b ;
                System.out.println(ans);
                break;
            default:
                System.out.println("Operator is not right");
                break;
        }

    }
}
