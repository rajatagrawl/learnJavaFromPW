import java.util.Scanner;

public class Methods1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        System.out.println(avg(a,b,c));
    }
    public static int avg(int x, int y, int z){
        return ((x+y+z)/3);
    }
}
