import java.util.Scanner;

public class Methods2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scn.nextLine();
        System.out.println(count(str));
    }
    public static int count(String str) {
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                count++;
            }
        }
        return count;
    }
}
