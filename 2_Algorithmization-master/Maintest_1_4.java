import java.util.Scanner;

//Даны действительные числа а 1  ,а 2  ,..., а n  . Поменять местами наибольший и наименьший элементы.
public class Maintest_1_4 {
    public static void main(String[] args) {
        double[] temp = new double[5];
        for (int i = 0; i < temp.length; i++)//диапазон -20 +20
            temp[i] = (Math.random() * ((20 - -20) + 1)) + -20;

        int min = 0;
        double tem = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] < tem) {
                tem = temp[i];
                min = i;
            }
        }
        int max = 0;
        tem = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > tem) {
                tem = temp[i];
                max = i;
            }
        }
        System.out.println("Массив до:");
        for (int i = 0; i < temp.length; i++)
            System.out.print( temp[i] + " ");
        System.out.println();

        tem = temp[min];
        temp[min] = temp[max];
        temp[max] = tem;

        System.out.println("Массив после:");
        for (int i = 0; i < temp.length; i++)
            System.out.print( temp[i] + " ");
        System.out.println();
    }
}
