import java.util.Scanner;

public class JavaIO3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int total = a + b + c ;
        float percentage = total / 3;

        System.out.println("Total = " + total);
        System.out.println("percentage = " + percentage);
    }
}
