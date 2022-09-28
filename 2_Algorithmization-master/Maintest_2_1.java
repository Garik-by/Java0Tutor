import java.util.Scanner;
//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
public class Maintest_2_1 {
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


        //вывод
        int i = 1;
        System.out.println("Массив после ");
        while ( i < n) {
            if(temp[i][0]>temp[i][1]) {
                for (int j = 0; j < m; j++)
                    System.out.print(temp[i][j] + " ");
                System.out.println();
            }
            i+=2;
        }
    }
}