import java.util.Scanner;

public class Methods3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scn.nextLine();
        System.out.println(middle(str));
    }

    public static String middle(String s) {
        if(s.length()%2 == 0) {
            return s.substring(s.length()/2, s.length()/2 +2);
        } else {
            return s.substring(s.length()/2,s.length()/2 + 1);
        }
    }
}
