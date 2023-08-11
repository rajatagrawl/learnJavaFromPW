import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int num = 1;
        while(num <= n){
            int count = 0;
            int i = num;
            while(i > 0){
                count++;
                i /= 10;
            }
            int val = num;
            int sum = 0;
            while (val > 0){
                int digit = val % 10;
                sum += Math.pow(digit,count);
                val /= 10;
                if(sum > val){
                    continue;
                }
            }
            if(sum == num){
                System.out.println(num);
            }
            num++;
        }

    }
}
