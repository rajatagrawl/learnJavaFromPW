import java.util.Scanner;

public class _2d_1 {

    public static void arr_multiply(int[][] arr1, int[][] arr2) {
        int[][] arr3 = new int[3][3];
            for(int i=0; i<3; i++){
                for (int j=0; j<3; j++){
                    arr3[i][j] = arr1[i][j] + arr2[i][j];
                    System.out.print(arr3[i][j] + " ");
                }
                System.out.println();
            }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        System.out.println("Enter 1st array elements:");
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                arr1[i][j] = scn.nextInt();
            }
        }
        System.out.println("Enter 2nd array elements:");
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                arr2[i][j] = scn.nextInt();
            }
        }

        arr_multiply(arr1, arr2);
    }


}
