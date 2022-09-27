//8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

import java.util.Scanner;
public class Maintest3_8 {
    static int[][] temp = {{0,0},{1,0},{2,0},{3,0},{4,0},{5,0},{6,0},{7,0},{8,0},{9,0}};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int q = in.nextInt();
        System.out.print("Введите второе число: ");
        int w = in.nextInt();
        poisk(q);
        poisk(w);
        System.out.print("Числа : ");
        for(int i = 0;i<10;i++)
            if(temp[i][1]==1)
                System.out.print( i + " ");
    }

    private static void poisk(int x) {
        while (x>0) {
            int tem = x % 10;
            for (int i = 0; i < 10; i++)
                if (temp[i][0] == tem)
                    temp[i][1] = 1;
            x = x / 10;
        }
    }

}
