//Найти сумму квадратов первых ста чисел.
public class Maintest3_3 {
    public static void main(String[] args) {
        long ret =0;
        for(int i = 1;i<= 100;i++)
            ret +=Math.pow(i,2);
        System.out.println("Результат = "+ret);
    }
}
