import java.util.Scanner;
//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
public class Maintest_2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = in.nextInt();
        System.out.print("Введите M: ");
        int m = in.nextInt();
        int[][] temp = new int[n][m];
        for (int i = 0; i < n; i++)//диапазон -20 +20
            for (int j = 0; j < m; j++)
                temp[i][j] = (int) (Math.random() * ((20 - -20) + 1)) + -20;

        //вывод
        System.out.println("Массив до ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(temp[i][j] + " ");
            System.out.println();
        }

        System.out.print("Введите k строку: ");
        int k = in.nextInt();
        if(k<n)
            for (int j = 0; j < m; j++)
                System.out.print(temp[k-1][j] + " ");
        else
            System.out.print("Строк меньше "+k);
        System.out.println();

        System.out.print("Введите p столбец: ");
        int p = in.nextInt();
        if(p<m)
            for (int j = 0; j < m; j++)
                System.out.print(temp[j][p-1] + " ");
        else
            System.out.print("Столбцов меньше "+p);
        System.out.println();

    }
}