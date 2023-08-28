public class Array1_5 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,4,2,35,7,0};
        System.out.println("Hello World");
        for (int i=1; i<arr.length-1; i++){
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
