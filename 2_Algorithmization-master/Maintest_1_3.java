import java.util.Scanner;

// Дан  массив  действительных  чисел,  размерность  которого  N.  Подсчитать,  сколько  в  нем  отрицательных,
//положительных и нулевых элементов.
public class Maintest_1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = in.nextInt();
        double[] temp = new double[n];
        for (int i = 0; i < temp.length; i++)//диапазон -20 +20
            temp[i] = (Math.random() * ((20 - -20) + 1)) + -20;

        int ret=0;
        for (int i = 0; i < temp.length; i++)
            if(temp[i] < 0)
                ret++;
        System.out.println("Кол-во отрецательных = " + ret);
        ret=0;
        for (int i = 0; i < temp.length; i++)
            if(temp[i] > 0)
                ret++;
        System.out.println("Кол-во положительных = " + ret);
        ret=0;
        for (int i = 0; i < temp.length; i++)
            if(temp[i] == 0)
                ret++;
        System.out.println("Кол-во нулевых = " + ret);
    }
}
