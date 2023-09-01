public class Arrprob2_1 {
    public static void main(String[] args) {
        swap(5,10);
    }

    static void swap(int a, int b){
        int x = a;
        int y = b;
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("values after swap: " + x + " " + y);
    }
}
