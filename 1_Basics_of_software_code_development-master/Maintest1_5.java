import java.util.Scanner;

public class Maintest1_5 {
    public static void main(String[] args) {
        System.out.print("In secomd = ");
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        System.out.format("%01d:%02d:%02d", seconds / 3600 % 24, seconds / 60 % 60, seconds % 60);
    }
}
