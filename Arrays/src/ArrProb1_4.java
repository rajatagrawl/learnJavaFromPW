import java.util.Scanner;

public class ArrProb1_4 {
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE ;
        for(int i=0; i<arr.length;i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        return max;
    }

    static int findSecondMax(int[] arr){
        int max = findMax(arr);
        for (int i=0; i<arr.length; i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secMax = findMax(arr);
        return secMax;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Array length");
        int len = scn.nextInt();
        int[] arr = new int[len] ;
        System.out.println("Enter Array elements");
        for(int i=0; i<len; i++){
            arr[i] = scn.nextInt();
        }
        int secMax = findSecondMax(arr);
        System.out.println("Second Max value is " + secMax);
    }
}
