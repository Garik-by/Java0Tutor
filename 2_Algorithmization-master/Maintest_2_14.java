import java.util.Scanner;
// Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.
public class Maintest_2_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во срок: ");
        int n = in.nextInt();
        System.out.print("Введите кол-во столбцов: ");
        int m = in.nextInt();
        int[][] temp = new int[n][m];
//в каждом столбце число единиц равно номеру столбца.
        int tem = n-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (tem <= j)
                    temp[i][j] = 1;

            }
            tem--;
        }

        //вывод
        System.out.println("Массив ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(temp[i][j] + " ");
            System.out.println();
        }
    }
}
