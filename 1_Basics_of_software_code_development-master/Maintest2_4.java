import java.util.Scanner;
// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//отверстие.
public class Maintest2_4 {
    public static void main(String[] args) {
        System.out.print("In A (double 0,0) = ");
        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();
        System.out.print("In B (double 0,0) = ");
        double b = console.nextDouble();
        System.out.print("In x (double 0,0) = ");
        double x = console.nextDouble();
        System.out.print("In y (double 0,0) = ");
        double y = console.nextDouble();
        System.out.print("In z (double 0,0) = ");
        double z = console.nextDouble();
        //кирпич пройдет если 2-е стороны будут меньше или равны
        if((a>=x && b>=y) || (a>=x && b>=z))
            System.out.println("Return = true");
        else if((a>=y && b>=z) || (a>=y && b>=x))
            System.out.println("Return = true");
        else if((a>=z && b>=x) || (a>=z && b>=y))
            System.out.println("Return = true");
        else
            System.out.println("Return = false");

    }
}
