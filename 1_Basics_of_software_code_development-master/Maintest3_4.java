public class Maintest3_4 {
    public static void main(String[] args) {
        long ret =1;
        for(int i = 1;i<= 200;i++)
            ret *=Math.pow(i,2);
        System.out.println("Результат = "+ret);
    }
}
