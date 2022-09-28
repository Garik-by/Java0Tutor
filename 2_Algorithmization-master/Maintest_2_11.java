// Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.
public class Maintest_2_11 {
    public static void main(String[] args) {
        int n = 10; int m = 20;
        int[][] temp = new int[n][m];
        for (int i = 0; i < n; i++)//диапазон 0 +15
            for (int j = 0; j < m; j++)
                temp[i][j] = (int) (Math.random() * ((15 - 0) + 1)) + 0;

        //вывод
        System.out.println("Массив ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(temp[i][j] + " ");
            System.out.println();
        }

        System.out.println("В строке которых число 5 встречается три и более раз ");
        int koll = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                if(temp[i][j] == 5)
                    koll++;
            if(koll+1>3)
                System.out.print(++i + " ");
            koll = 0;
        }
    }
}