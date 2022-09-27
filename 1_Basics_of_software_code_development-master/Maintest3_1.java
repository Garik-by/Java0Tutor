import java.util.Scanner;

public class Maintest3_1 {
    public static void main(String[] args) {
        System.out.print("In (int) = ");
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int ret = 0;
        if(x<0)
            System.out.println("Число отрицательно");
        else
            for (int i=1;i<x;i++)
                ret+=i;
        System.out.println(ret);
    }
}
