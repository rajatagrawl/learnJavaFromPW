import java.util.Scanner;

public class ArrProb1_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int len;
        System.out.println("Enter Array length");
        len = scn.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter Array elements");
        for(int i=0; i< arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the integer x:");
        int x = scn.nextInt();
        int ans = 0;
        for(int i=0; i < arr.length; i++){
            for (int j=i+1; j< len; j++){
                if(arr[j] - arr[i] == x){
                    ans++;
                }
            }
        }
        System.out.println("Answer is " + ans);
    }
}
