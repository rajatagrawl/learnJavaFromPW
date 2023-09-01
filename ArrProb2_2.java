import java.util.Scanner;

public class ArrProb2_2 {
    static void reverseArray(int[] arr, int len){
        int j = len-1;
        int i = 0;
        while (i < j) {
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
            i++;
            j--;
        }
        for (int val: arr){
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length of array");
        int len = scn.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter elements of array");
        for(int i=0; i<len; i++){
            arr[i] = scn.nextInt();
        }
        reverseArray(arr, len);
    }
}
