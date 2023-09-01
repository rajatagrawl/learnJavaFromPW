import java.awt.desktop.PreferencesEvent;
import java.util.Scanner;

public class ArrProb2_3 {
    static void rotate(int[] arr, int k){
        int n = arr.length;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }

    static void reverse(int[] arr, int a, int b){
        while (a<b) {
            arr[a] = arr[a]+arr[b];
            arr[b] = arr[a]-arr[b];
            arr[a] = arr[a]-arr[b];
            a++;
            b--;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length of array");
        int len = scn.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter array elements:");
        for (int i=0; i<len; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter number of times to rotate:");
        int k = scn.nextInt();
        k = k%len;
        rotate(arr, k);
        for(int val: arr){
            System.out.print(val + " ");
        }
    }
}
