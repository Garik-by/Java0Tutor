import java.util.Scanner;

// Дана последовательность действительных чисел а 1  ,а 2  ,..., а п. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.
public class Maintest_1_2 {
    public static void main(String[] args) {
        double [] temp = new double[20];
        for(int i = 0; i<temp.length;i++)//диапазон -20 +20
            temp[i]=(Math.random() * ((20 - -20) + 1)) + -20;Scanner in = new Scanner(System.in);
        System.out.print("Введите Z: ");
        double z = in.nextDouble();
        int ret = 0;
        for (int i = 0; i < temp.length; i++)
            if (temp[i]>z) {
                temp[i] = z;
                ret++;
            }
        System.out.println("Кол-во замен = " + ret);
    }
}
