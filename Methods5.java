import java.util.Scanner;

public class Methods5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 3 integers");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        System.out.println("Minimum number is:" + min(a,b,c));
    }

    public static int min(int x, int y, int z){
        return (Math.min(x, Math.min(y,z)));
    }
}
