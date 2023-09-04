import java.util.Scanner;

public class SimpleInterest2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal");
        float pr = sc.nextFloat();

        System.out.println("Enter rate");
        float rate = sc.nextFloat();

        System.out.println("Enter Time");
        float time = sc.nextFloat();

        float amount = (pr * rate * time) / 100;
        System.out.println("Amount is : " + amount);

    }
}
