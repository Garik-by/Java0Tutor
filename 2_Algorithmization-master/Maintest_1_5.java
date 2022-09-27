import java.util.Scanner;
//Даны целые числа а 1  ,а 2  ,..., а n  . Вывести на печать только те числа, для которых а i  > i.
public class Maintest_1_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите i: ");
        int q = in.nextInt();
        int[] temp = new int[5];
        for (int i = 0; i < temp.length; i++)//диапазон -20 +20
            temp[i] = (int)(Math.random() * ((20 - -20) + 1)) + -20;

        System.out.println("Массив:");
        for (int i = 0; i < temp.length; i++)
            System.out.print( temp[i] + " ");
        System.out.println();

        System.out.print("Вывод ");
        for (int i = 0; i < temp.length; i++)
            if(temp[i]>q)
                System.out.print(temp[i] + " ");

    }
}
