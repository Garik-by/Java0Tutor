import java.util.Scanner;
//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
public class Maintest_2_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во срок: ");
        int n = in.nextInt();
        System.out.print("Введите кол-во столбцов: ");
        int m = in.nextInt();
        int[][] temp = new int[n][m];
        for (int i = 0; i < n; i++)//диапазон 0 +20
            for (int j = 0; j < m; j++)
                temp[i][j] = (int) (Math.random() * ((20 - 0) + 1)) + 0;

        //вывод
        System.out.println("Массив ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(temp[i][j] + " ");
            System.out.println();
        }


        System.out.println("Массив по возрастанию");
        for (int i = 0; i < n; i++)
            sort_min_mah(temp[i]);

        System.out.println("Массив по убыванию");
        for (int i = 0; i < n; i++)
            sort_mah_min(temp[i]);
    }
    static void sort_min_mah(int[] temp){
        int[] array = new int[temp.length];
        array = temp;
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            array[i + 1] = value;
        }
        for (int left = 0; left < array.length; left++)
            System.out.print(array[left] + " ");
        System.out.println();
    }
    static void sort_mah_min(int[] temp){
        int[] array = new int[temp.length];
        array = temp;
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value > array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            array[i + 1] = value;
        }
        for (int left = 0; left < array.length; left++)
            System.out.print(array[left] + " ");
        System.out.println();
    }
}