import java.util.Scanner;

public class Maintest3_2 {
    public static void main(String[] args) {
        double y = 0.0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите начало отрезка: ");
        double a = in.nextInt();
        System.out.println("Введите конец отрезка: ");
        double b = in.nextInt();
        System.out.println("Введите шаг h: ");
        double h = in.nextDouble();
        for (double x = a; x <= b; x += h)
            if (x <= 2)
                y = -x;
            else
                y = x;

        System.out.println(y);
    }
}
