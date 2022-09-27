import java.util.Scanner;
// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
public class Maintest_1_1 {
    public static void main(String[] args) {
        int [] A = new int[20];
        for(int i = 0; i<A.length;i++)//диапазон 0 +20
            A[i]=(int) (Math.random() * ((20 - 0) + 1)) + 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите К: ");
        int k = in.nextInt();
        int ret = 0;
        for (int i = 0; i < A.length; i++)
            if (i % k == 0)
                ret+=i;
        System.out.println("Сумма = " + ret);
    }
}
