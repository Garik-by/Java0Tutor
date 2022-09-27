import java.util.Scanner;

public class Maintest1_2 {
    public static void main(String[] args) {
        System.out.print("In A (double 0,0) = ");
        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();

        System.out.print("In B (double 0,0) = ");
        double b = console.nextDouble();

        System.out.print("In C (double 0,0) = ");
        double c = console.nextDouble();

        double ret=(b+Math.sqrt(Math.pow(b,2)+4*a*c))/2*a - Math.pow(a,3)*c + Math.pow(b,-2);

        System.out.println("Return = "+ret);

    }
}