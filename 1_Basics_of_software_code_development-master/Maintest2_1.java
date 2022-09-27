import java.util.Scanner;

public class Maintest2_1 {
    public static void main(String[] args) {
        System.out.print("In corner 1 (double 0,0) = ");
        Scanner console = new Scanner(System.in);
        double x = console.nextDouble();
        System.out.print("In corner 2 (double 0,0) = ");
        double y = console.nextDouble();
        if((x+y)<180) {
            System.out.print("triangle = true ; ");
            if((x+y)==90)
                System.out.println("corner = true");
            else
                System.out.println("corner = false");
        }else
            System.out.println("triangle = false");
    }
}
