import java.util.Scanner;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Maintest_2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = in.nextInt();
        if(n%2 == 0) {
            int[][] temp = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++){
                    if(i%2 == 0)
                        temp[i][j]=j+1;
                    else
                        temp[i][j]=n-j;
                }




                    //вывод
            System.out.println("Массив до ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    System.out.print(temp[i][j] + " ");
                System.out.println();
            }
        }else
            System.out.print("N - должно быть четным");
        System.out.println();
    }
}
