import java.util.Scanner;

public class ArrProb3_7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("Enter Array length");
        int len = scn.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter Array elements:");
        for (int i=0; i<len; i++){
            arr[i] = scn.nextInt();
        }
        sortEvenOdd(arr);
    }
    static void sortEvenOdd(int[] arr){
        int r = arr.length - 1;
        int l = 0;
        while (l<r) {
            if(arr[l]%2==0 && arr[r]%2==1){
                arr[l] = arr[l] + arr[r];
                arr[r] = arr[l] - arr[r];
                arr[l] = arr[l] - arr[r];
                l++;
                r--;
            }
            if(arr[l]%2==1){
                l++;
            }
            if(arr[r]%2==0){
                r--;
            }
        }
        for (int val: arr){
            System.out.print(val + " ");
        }
    }
}
