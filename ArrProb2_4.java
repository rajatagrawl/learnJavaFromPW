import java.util.Scanner;

public class ArrProb2_4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Array length:");
        System.out.println("Hello World");
        int len = scn.nextInt();
        int[] arr = new int[len];
        int[] ans = new int[106];

        for (int j=0; j<ans.length; j++){
            ans[j]=0;
        }
        System.out.println("Enter array elements:");
        for(int i=0; i<len; i++){
            arr[i] = scn.nextInt();
            ans[arr[i]]++;
        }
        System.out.println("Enter number of queries:");
        int q = scn.nextInt();
        while(q>0){
            int val = scn.nextInt();
            if(ans[val] > 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            q--;
        }
    }
}
