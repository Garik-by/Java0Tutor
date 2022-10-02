import java.util.ArrayList;
import java.util.Scanner;
// Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один  массив,  включив  второй  массив  между  k-м  и  (k+1)  -  м  элементами  первого,  при  этом  не  используя
//дополнительный массив.
public class Maintest_3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите k до 5: ");
        int k = in.nextInt();
        ArrayList<Integer> Arr1 = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++)//диапазон -20 +20
            Arr1.add((int) (Math.random() * ((20 - -20) + 1)) + -20);
        ArrayList<Integer> Arr2 = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++)//диапазон -20 +20
            Arr2.add((int) (Math.random() * ((20 - -20) + 1)) + -20);

        System.out.println(Arr1.toString());//выводим рандомный массив 1
        System.out.println(Arr2.toString());//выводим рандомный массив 2

        for(int i = 0;i<Arr2.size();i++)    //сращиваем
            Arr1.add(k+i,Arr2.get(i));

        System.out.println(Arr1.toString());//выводим результат
    }
}
