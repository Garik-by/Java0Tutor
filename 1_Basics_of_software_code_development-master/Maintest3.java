import java.util.Scanner;
public class Maintest3 {
    public static void main(String[] args) {
        System.out.print("In X (double 0,0) = ");
        Scanner console = new Scanner(System.in);
        double x = console.nextDouble();
        System.out.print("In Y (double 0,0) = ");
        double y = console.nextDouble();

        double ret=(Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)) * Math.tan(x*y);

        System.out.println("Return = "+ret);
    }
}
