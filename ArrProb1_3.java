import java.util.Scanner;

public class ArrProb1_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int len;
        System.out.println("Enter Array length");
        len = scn.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter array elements:");
        for(int i=0; i<len; i++){
            arr[i] = scn.nextInt();
        }

    }
}
