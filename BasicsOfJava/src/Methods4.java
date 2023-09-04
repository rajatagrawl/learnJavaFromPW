import java.util.Scanner;

public class Methods4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scn.nextInt();
        System.out.println(is_leap(year));
    }

    public static boolean is_leap(int yr){
        if (yr%4 == 0){
            return true;
        } else {
            return false;
        }
    }
}
