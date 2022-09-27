import java.util.Scanner;
//7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.
public class Maintest3_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите m: ");
        int m = in.nextInt();
        System.out.println("Введите n: ");
        int n = in.nextInt();
        if (m > n) {
            int tem = m;
            m = n;
            n = tem;
        }
        for ( int i = m; i <= n;  i++ ){
            System.out.print("Для числа " + i + ", кроме единицы и самого числа делители - ");
            for (int j = 2; j < i; j++)
                if (i % j == 0)
                    System.out.print(j + ", ");
            System.out.println("и все!");
        }
    }
}
