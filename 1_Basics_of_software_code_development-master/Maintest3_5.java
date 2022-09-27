import java.util.Scanner;
/*5.  Даны  числовой  ряд  и  некоторое  число  е.  Найти  сумму  тех  членов  ряда,  модуль  которых  больше  или  равен
заданному е. Общий член ряда имеет вид: */
public class Maintest3_5 {
    public static void main(String[] args) {
        System.out.print("Введите Е (double 0,0) = ");
        Scanner console = new Scanner(System.in);
        double e = console.nextDouble();
        System.out.print("Введите начальное n (int) = ");
        int start = console.nextInt();
        System.out.print("Введите конечное n (int) = ");
        int stop = console.nextInt();
        double ret = 0;

        if(start>stop){
            int tem = stop;
            stop = start;
            start = tem;
        }
        for(int i = start; i<=stop; i++) {
            double a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if(Math.abs(a)>=e)
                 ret += Math.abs(a);
            }
        System.out.println("Результат = " + ret);
    }
}
