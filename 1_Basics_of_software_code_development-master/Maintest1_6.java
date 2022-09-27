import java.util.Scanner;

public class Maintest1_6 {
    public static void main(String[] args) {
        System.out.print("In ponit x ; y (2.015;4.01) = ");
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        String[] parts = temp.split(";");
        double x = Double.parseDouble(parts[0]);
        double y = Double.parseDouble(parts[1]);
        if((x>=-4) && (x<=4) && (y>=-3) && (y<=0))
            System.out.println("true");
        else if ((x>=-2) && (x<=2) && (y>=0) && (y<=4))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
