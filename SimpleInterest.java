import java.util.Scanner ;

public class SimpleInterest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter principal amount") ;
        float principal = sc.nextFloat() ;

        System.out.println("Enter the rate") ;
        float rate = sc.nextFloat() ;

        System.out.println("Enter Time") ;
        float time = sc.nextFloat();

        float simpleInterest = (principal * rate * time) / 100 ;
        System.out.println("Interest amount is : " + simpleInterest) ;

    }
}
