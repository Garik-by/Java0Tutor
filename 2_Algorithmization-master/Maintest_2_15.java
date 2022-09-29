import java.util.Scanner;
// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
public class Maintest_2_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во срок: ");
        int n = in.nextInt();
        System.out.print("Введите кол-во столбцов: ");
        int m = in.nextInt();
        int[][] temp = new int[n][m];
        for (int i = 0; i < n; i++)//диапазон -20 +20
            for (int j = 0; j < m; j++)
                temp[i][j] = (int) (Math.random() * ((20 - -20) + 1)) + -20;


        //вывод
        System.out.println("Массив ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(temp[i][j] + " ");
            System.out.println();
        }

        int max = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if(max<temp[i][j])
                    max=temp[i][j];


        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if(temp[i][j]%2==-1 || temp[i][j]%2==1)
                    temp[i][j] = max;
        //вывод
        System.out.println("Массив ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(temp[i][j] + " ");
            System.out.println();
        }
    }
}
