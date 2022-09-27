import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Maintest2_3 {
    //Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
    public static void main(String[] args) {
        System.out.print("In A(х1;у1) (double 0,0) = ");
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        System.out.print("In B(х1;у1) (double 0,0) = ");
        String b = console.nextLine();
        System.out.print("In C(х1;у1) (double 0,0) = ");
        String c = console.nextLine();
        //if ((x_3 - x_1) / (x_2 - x_1) == (y_3 - y_1) / (y_2 - y_1)) /*Точки 1, 2, 3 - лежат на одной прямой */
        if(((point_x(c)-point_x(a))/(point_x(b)-point_x(a))) == ((point_y(c)-point_y(a))/(point_y(b)-point_y(a))))
            System.out.println("Return = true");
        else
            System.out.println("Return = false");

    }
    static double point_x(@NotNull String point){
        String[] tem = point.split(";");
        return Double.parseDouble(tem[0]);
    }
    static double point_y(@NotNull String point){
        String[] tem = point.split(";");
        return Double.parseDouble(tem[1]);
    }
}
