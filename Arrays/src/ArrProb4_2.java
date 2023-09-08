import java.util.Scanner;

public class ArrProb4_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Array length");
        int len = scn.nextInt();
        int[] arr = new int[len+1];
        System.out.println("Enter Array elements");
        for (int i=1; i<=len; i++){
            arr[i] = scn.nextInt();
        }
        findSubseq(arr);
    }
    static void findSubseq(int[] arr){
        Scanner scn = new Scanner(System.in);
        for (int i=1; i< arr.length; i++){
            arr[i] += arr[i-1];
        }
        System.out.println("Enter number of queries");
        int q = scn.nextInt();
        while (q-- > 0){
            System.out.print(q + " ");
        }
    }
}
