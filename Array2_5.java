import java.util.Scanner;

public class Array2_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Array length:");
        int len = scn.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter Array elements");
        for (int i=0; i<len; i++){
            arr[i] = scn.nextInt();
        }
        boolean ans = true;
        int[] arr2 = new int[len];
        System.out.println("Enter 2nd array elements:");
        for (int i=0; i<len; i++){
            arr2[i] = scn.nextInt();
            if(arr2[i] != arr[i]){
                ans = false;
                break;
            }
        }
        System.out.println(ans);
    }
}
