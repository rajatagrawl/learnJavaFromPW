import java.util.Scanner;

public class JavaIOAssign1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name : ");
        String name = sc.nextLine();
        System.out.println("Enter field of interest : ");
        String field = sc.nextLine();
        System.out.println("Enter Roll Number : ");
        int roll = sc.nextInt();



        System.out.println(name + roll + field);
    }
}
