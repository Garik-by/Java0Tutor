import java.util.Scanner;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Maintest_2_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = in.nextInt();
        if(n%2 == 0) {
            int indeh = 0;
            boolean triger = false;

            int[][] temp = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if((j+indeh*2)<n)
                        temp[i][j+indeh] = 1;
                }
                if(!triger)
                    indeh++;
                else
                    indeh--;
                if(indeh==n/2){
                    triger = true;
                    indeh--;
                }
            }

            //вывод
            System.out.println("Массив ");
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
