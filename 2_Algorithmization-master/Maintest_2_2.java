import java.util.Scanner;
// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
public class Maintest_2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = in.nextInt();
        int[][] temp = new int[n][n];
        for (int i = 0; i < n; i++)//диапазон -20 +20
            for (int j = 0; j < n; j++)
                temp[i][j] = (int) (Math.random() * ((20 - -20) + 1)) + -20;

        //вывод
        System.out.println("Массив до ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(temp[i][j] + " ");
            System.out.println();
        }

        System.out.println("Диагонали ");
        for (int i = 0; i < n; i++)
                System.out.print(temp[i][i] + " ");
        System.out.println();

        for (int i = 0; i < n; i++)
            System.out.print(temp[n-i-1][i] + " ");
        System.out.println();

    }
}