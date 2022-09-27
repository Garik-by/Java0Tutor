import java.util.Scanner;
public class Maintest4 {
    public static void main(String[] args) {
        System.out.print("In (format  nnn,ddd) = ");
        Scanner console = new Scanner(System.in);
        double x = console.nextDouble();
        int n = (int) x;
        x-=n;
        x*=1000;
        int d = (int) Math.ceil(x);
        System.out.println("Return = "+d+","+n);
    }
}
