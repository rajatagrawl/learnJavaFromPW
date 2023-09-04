import java.util.Scanner;

public class ArrProb1_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Array length");
        int len = scn.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter array elements");
        for(int i=0; i<len; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the number to check");
        int num = scn.nextInt();
        int count = 0;
        for(int i=0; i<len; i++){
            if(arr[i] == num){
                count++ ;
            }
        }
        System.out.println("Num of occurrences: " + count);
    }
}
