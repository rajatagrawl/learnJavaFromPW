import java.util.Scanner;

public class ArrProb3_6 {
    static void sortZeroAndOnes(int[] arr) {
        int j = arr.length - 1;
        int i = 0;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
                i++;
                j--;
            }
            if (arr[i] == 0){
                i++;
            }
            if (arr[j] == 1){
                j--;
            }
        }
        for (int val: arr){
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Array length");
        int len = scn.nextInt();
        int[] arr = new int[len];
        for (int i=0; i<len; i++){
            arr[i] = scn.nextInt();
        }
        sortZeroAndOnes(arr);
    }
}
