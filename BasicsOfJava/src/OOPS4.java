import java.util.Scanner;

class Complex {
    int real;
    int imag;
    public Complex(int i, int r){
        real = r;
        imag = i;
    }

    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real),(a.imag+b.imag));
    }

    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real- b.real),(a.imag-b.imag));
    }

    public void printComplex(){
        if(real==0 && imag!=0){
            System.out.println(imag+"i");
        }else if(real!=0 && imag==0){
            System.out.println(real);
        }else {
            System.out.println(real+"+"+imag+"i");
        }
    }
}
public class OOPS4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter real part1");
        int r1 = scn.nextInt();
        System.out.println("Enter complex part1");
        int i1 = scn.nextInt();
        System.out.println("Enter real part2");
        int r2 = scn.nextInt();
        System.out.println("Enter complex part2");
        int i2 = scn.nextInt();
        Complex c = new Complex(r1,i1);
        Complex d = new Complex(r2,i2);
        Complex e = Complex.add(c,d);
        Complex f = Complex.diff(c,d);
        e.printComplex();
        f.printComplex();
    }
}
