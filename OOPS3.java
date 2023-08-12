import java.util.Scanner;

class Area {
    int x;
    int y;
    public Area(int l, int b){
        x = l;
        y = b;
    }
    public int getArea(){
        return x*y;
    }
}

public class OOPS3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter length and breadth");
        int len = scn.nextInt();
        int brd = scn.nextInt();
        Area a = new Area(len,brd);
        System.out.println(a.getArea());

    }
}
