public class Array1_4 {
    public static void main(String[] args) {
        int[] arr = {-10,2,-3,5,8,1,0,-4};
        int ans = 0;
        for (int val: arr){
            if(val < ans){
                ans = val;
            }
        }
        System.out.println(ans);
    }
}
