import java.util.Scanner;
//Даны действительные числа  Найти
public class Maintest_1_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = in.nextInt();
        int[] temp = new int[n];
        for (int i = 0; i < temp.length; i++)//диапазон -20 +20
            temp[i] = (int) (Math.random() * ((20 - -20) + 1)) + -20;

        System.out.println("Массив: ");
        for (int i = 0; i < temp.length; i++)
            System.out.print(temp[i] + " ");
        System.out.println();

        int max = 0;
        for (int i = 0; i < temp.length-1; i++) {
            int q = temp[i] + temp[i + 1];
            if(q>max)
                max=q;
        }
        System.out.println("Максимальная сумма соседей : " + max);
    }
}