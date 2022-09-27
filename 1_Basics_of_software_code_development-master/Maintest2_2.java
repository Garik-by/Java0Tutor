import java.util.Scanner;

public class Maintest2_2 {
    public static void main(String[] args) {
        System.out.print("In a (double 0,0) = ");
        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();
        System.out.print("In b (double 0,0) = ");
        double b = console.nextDouble();
        System.out.print("In c (double 0,0) = ");
        double c = console.nextDouble();
        System.out.print("In d (double 0,0) = ");
        double d = console.nextDouble();
        //max{min(a, b), min(c, d)}.
        System.out.println("Return = "+max(min(a,b),min(c,d)));
    }
    static double min(double x, double y){
        if(x>y)
            return y;
        else
            return x;
    }
    static double max(double x, double y){
        if(x>y)
            return x;
        else
            return y;
    }
}
