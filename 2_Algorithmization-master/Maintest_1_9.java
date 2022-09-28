import java.util.Scanner;
// В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.
public class Maintest_1_9 {
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

        //ищем повторы
        int[][] temp2 = new int[n][2];
        int q = 0;
        int add = 0;
        for (int i = 0; i < temp.length; i++){
            int tem = temp[i];
            for(int j = 0; j<=q; j++){
                int tem2 = temp2[j][0];
                if(tem == tem2){
                    temp2[j][1]++;
                    add = 1;
                    break;
                }
            }
            if(add==0) {
                temp2[q][0] = tem;
                q++;
            }else
                add = 0;
        }
        System.out.println("Повторы: ");
        for(int j = 0; j<=q; j++) {
            if(temp2[j][1]>0){
                if(temp2[j][0]!=0)
                    temp2[j][1]++;
                System.out.print(temp2[j][0] + " - " + temp2[j][1] + " раз; ");
            }
        }
    }
}
