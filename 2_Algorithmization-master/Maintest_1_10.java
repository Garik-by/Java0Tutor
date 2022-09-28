import java.util.Scanner;
// Дан  целочисленный  массив  с  количеством  элементов  п.  Сжать  массив,  выбросив  из  него  каждый  второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
public class Maintest_1_10 {
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

        int i = 1;
        while ( i < temp.length ){
            temp[i] = 0;
            i+=2;
        }

        System.out.println("Массив полсе: ");
        for (int j = 0; j < temp.length; j++)
            System.out.print(temp[j] + " ");
        System.out.println();
    }
}