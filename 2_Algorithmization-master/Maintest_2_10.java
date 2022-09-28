import java.util.Scanner;
// Найти положительные элементы главной диагонали квадратной матрицы.
public class Maintest_2_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во срок: ");
        int n = in.nextInt();
        int[][] temp = new int[n][n];
        for (int i = 0; i < n; i++)//диапазон -20 +20
            for (int j = 0; j < n; j++)
                temp[i][j] = (int) (Math.random() * ((20 - -20) + 1)) + -20;

        //вывод
        System.out.println("Массив ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(temp[i][j] + " ");
            System.out.println();
        }

        int index = 0;
        int[] glav = new int[n];

        for (int i = 0; i < n; i++)
            if(temp[i][i]>0){
                glav[index]=temp[i][i];
                index++;
            }

        System.out.println("Положительные элементы главной диагонали ");

        for (int i = 0; i < index; i++)
            System.out.print(glav[i]+" ");

    }
}
