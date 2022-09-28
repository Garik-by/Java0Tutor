import java.util.Scanner;

//Задана  последовательность  N  вещественных  чисел.  Вычислить  сумму  чисел,  порядковые  номера  которых
//являются простыми числами.
public class Maintest_1_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = in.nextInt();
        int[] temp = new int[n];
        for (int i = 0; i < temp.length; i++)//диапазон -20 +20
            temp[i] = (int)(Math.random() * ((20 - -20) + 1)) + -20;

        System.out.println("Массив: ");
        for (int i = 0; i < temp.length; i++)
            System.out.print( temp[i] + " ");
        System.out.println();

        System.out.print("Вывод ");
        for (int i = 0; i < temp.length; i++){
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    count = 1;
            }
            if( count == 0)
                System.out.print(i + " ");
        }
    }
}
