import java.util.Scanner;
//Дана  последовательность  целых  чисел  Образовать  новую  последовательность,  выбросив  из
//исходной те члены, которые равны min
public class Maintest_1_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = in.nextInt();
        int[] temp = new int[n];
        for (int i = 0; i < temp.length; i++)//диапазон -20 +20
            temp[i] = (int) (Math.random() * ((20 - -20) + 1)) + -20;

        System.out.println("Массив до: ");
        for (int i = 0; i < temp.length; i++)
            System.out.print(temp[i] + " ");
        System.out.println();
        //ищем минимальное
        int min = 0;
        for (int i = 0; i < temp.length; i++)
            if(temp[i]<min)
                min = temp[i];
        //создаем новый массив
        int[] temp2 = new int[n-1];

        //копируем
        int q=0;
        for (int i = 0; i < temp.length; i++)
            if(temp[i]!=min)
                temp2[i+q] = temp[i];
            else
                q--;

        //выводим
        System.out.println("Массив после: ");
        for (int i = 0; i < temp2.length; i++)
            System.out.print(temp2[i] + " ");
        System.out.println();
    }
}
