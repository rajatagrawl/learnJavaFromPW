import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array2_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter length of array");
        int len = scn.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter elements of array");
        for(int i=0; i<len; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter value of K:");
        int k = scn.nextInt();

        Arrays.sort(arr);
        System.out.println("Answer is :" + arr[k-1]);
    }
}
