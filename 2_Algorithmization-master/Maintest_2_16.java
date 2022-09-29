import java.util.Scanner;

//Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
//..., 2n  так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат. Пример магического квадрата порядка 3:
public class Maintest_2_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во срок: ");
        int n = in.nextInt();

        int[][] temp = stroim(n);//получаем массив
        int len = temp.length;

        //вывод
        System.out.println("Массив ");
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++)
                System.out.print(temp[i][j] + " ");
            System.out.println();
        }
    }

    private static int[][] stroim(int n) {
        if (n % 2 != 0) return Siamese_method(n);// метод для n нечетной размерности (3, 7, 9, и тд)
        return evenMatrixSquare(n);                        // метод для n четн-четной размерности (n кратно и 2 и 4);
    }

    //Сиамский метод - Siamese method
    private static int[][] Siamese_method(int n) {
        int[][] matrix = new int[n][n];
        int index = 1;
        int y = 0, x = matrix.length / 2;
        while (true) {
            matrix[y][x] = index;
            index++;
            if (((y == 0) && (x >= n - 1)) && (matrix[n - 1][0] != 0))
                y++;
            else {
                y--;
                if (y < 0)
                    y = n - 1;
                x++;
                if (x == n)
                    x = 0;
                if (matrix[y][x] != 0) {
                    y += 2;
                    x--;
                }
            }
            if (index == n * n + 1)
                break;
        }
        return matrix;
    }

    private static int[][] evenMatrixSquare(int n) {
        // Метод Раус-Болла хорошое описание нашел тут:
        // https://rep.bntu.by/bitstream/handle/data/62327/Magicheskie_kvadraty.pdf?sequence=1&isAllowed=y
        // Страница 8, 9
        int shet = 1;
        int[][] matrix = new int[n][n];//заполняем 1-
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                matrix[i][j] = shet;
                shet++;
            }
        shet--;
        int[][] tempMatrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                tempMatrix[i][j] = shet;
                shet--;
            }

        int size = 4;    // Размерность каждого квадрата (4х4 тафтология)
        int x = 0;
        int y = 0;
        for (int i = 0; i < (n * n / 16); i++) {
            if (x == (int) Math.sqrt(n * n / 16)) {
                x = 0;
                y++;
            }
            for (int j = 0; j < 4; j++) {
                matrix[size * y + j][size * x + j] = tempMatrix[size * y + j][size * x + j];  // главная диагональ квадратов 4х4
                matrix[size * y + j][size * x + size - 1 - j] = tempMatrix[size * y + j][size * x + size - 1 - j]; // побочная диагональ
            }
            x++;
        }
        return matrix;
    }
}