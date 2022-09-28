import java.util.Scanner;
//Сформировать квадратную матрицу порядка N по правилу:
public class Maintest_2_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = in.nextInt();
        int kol = 0;
        double [][] temp = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                temp[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if(temp[i][j]>0)
                    kol++;
            }
        //вывод
        System.out.println("Массив ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(temp[i][j] + " ");
            System.out.println();
        }
        System.out.println("Положительных "+ kol);
    }
}
