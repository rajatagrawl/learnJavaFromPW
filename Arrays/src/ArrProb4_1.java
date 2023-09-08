import java.util.Scanner;

public class ArrProb4_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Array length");
        int len = scn.nextInt();
        int[] arr = new int[len+1];
        System.out.println("Enter Array elements:");
        for(int i=1; i<=len; i++){
            arr[i] = scn.nextInt();
        }
        runningSum(arr);
    }

    static void runningSum(int[] arr){
        for (int i=1; i< arr.length; i++){
            arr[i] += arr[i-1];
            System.out.print(arr[i] + " ");
        }
    }
}
