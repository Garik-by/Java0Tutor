import java.util.Scanner;

public class Maintest2_5 {
    public static void main(String[] args) {
        System.out.print("In X (double 0,0) = ");
        Scanner console = new Scanner(System.in);
        double x = console.nextDouble();
        double ret = 0.0;
        if(x<=3)
            ret = Math.pow(x,2)-3*x+9;
        if(x>3)
            ret = 1 / (Math.pow(x,3)+6);
        System.out.println("Return = " +ret);
    }
}