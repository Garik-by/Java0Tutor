import java.util.Scanner;
//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.
public class Maintest_2_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во срок: ");
        int n = in.nextInt();
        System.out.print("Введите кол-во столбцов: ");
        int m = in.nextInt();
        int[][] temp = new int[n][m];
        for (int i = 0; i < n; i++)//диапазон 0 +20
            for (int j = 0; j < m; j++)
                temp[i][j] = (int) (Math.random() * ((20 - 0) + 1)) + 0;

        //вывод
        System.out.println("Массив ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(temp[i][j] + " ");
            System.out.println();
        }

        int[] summa  = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                summa[j]  += temp[i][j];
        }

        int max = summa[0]; int max_index = 0;
        for (int i = 0; i < n; i++) {
            if(max < summa[i]){
                max = summa[i];
                max_index = i + 1;
            }
        }
        System.out.println("Столбец " + max_index + " c суммой " + max);
    }
}
