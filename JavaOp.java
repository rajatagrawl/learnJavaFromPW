import java.util.Scanner;

public class JavaOp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        float result = (((x +8 )/3) % 5) *5 ;
        System.out.println(result);
    }
}
