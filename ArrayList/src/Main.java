import com.sun.jdi.Value;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world again!");
//        Integer in = new Integer(4);
        Integer in = Integer.valueOf(5);
        System.out.println(in);
        Float fl = Float.valueOf(4.5f);
        System.out.println(fl);

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(3);
        arr1.add(8);
        arr1.add(1);
        arr1.add(6);
        arr1.add(5);
        System.out.println(arr1);

        System.out.println(arr1.get(1));

//        for(int i =0; i<arr1.size(); i++) {
//            System.out.println(arr1.get(i));
//        }

        arr1.add(1, 5);
        System.out.println(arr1);

        arr1.set(1, 9);
        System.out.println(arr1);

        arr1.remove(1);
        System.out.println(arr1);

        arr1.remove(Integer.valueOf(8));
        System.out.println(arr1);

        System.out.println(arr1.contains(Integer.valueOf(51)));


    }
}
