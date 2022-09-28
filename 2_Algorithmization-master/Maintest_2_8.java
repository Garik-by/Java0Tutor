import java.util.Scanner;
//В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.
public class Maintest_2_8 {
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
        System.out.println("Массив до");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(temp[i][j] + " ");
            System.out.println();
        }

        System.out.print("Введите столбец 1 от 1 до " + m);
        int stol1 = in.nextInt()-1;
        System.out.print("Введите столбец 2 от 1 до " + m);
        int stol2 = in.nextInt()-1;

        int[]temp1 = new int[n];
        for (int i = 0; i < n; i++)
            temp1[i] = temp[i][stol1];
        for (int i = 0; i < n; i++)
            temp[i][stol1] = temp[i][stol2];
        for (int i = 0; i < n; i++)
            temp[i][stol2] = temp1[i];

        //вывод
        System.out.println("Массив после");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(temp[i][j] + " ");
            System.out.println();
        }
    }
}
