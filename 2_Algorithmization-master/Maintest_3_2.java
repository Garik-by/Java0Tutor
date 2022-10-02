import java.util.ArrayList;
import java.util.Scanner;
//Даны две последовательности а и б Образовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
public class Maintest_3_2 {
    public static void main(String[] args) {
        ArrayList<Integer> Arr1 = new ArrayList<Integer>();
        for (int i = 1; i <=5; i++)
            Arr1.add(i*2);
        ArrayList<Integer> Arr2 = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++)
            Arr2.add(i*3);

        System.out.println(Arr1.toString());//выводим массив 1
        System.out.println(Arr2.toString());//выводим массив 2

        int ind1=0;
        int ind2=0;
        while (true){   //сращиваем
            int q = Arr1.get(ind1);//берем 1 в 1
            int w = Arr1.get(ind1+1);//берем 2 в 1

            int a = Arr2.get(ind2);//берем 1 в 2
            if(q<=a) //сравниваем 1-е из 2 с 1 и 2 из 1-го
                if(w<=a)
                    ind1++;
                else {
                    Arr1.add(ind1 + 1, Arr2.get(ind2));
                    ind1++;
                    ind2++;
                }
            else{
                Arr1.add(ind1, Arr2.get(ind2));
                ind1++;
                ind2++;
            }
            if(ind1==Arr1.size()-1)
                while (ind2<Arr2.size()){
                    Arr1.add(Arr2.get(ind2));
                    ind2++;
                }

            if(ind2==Arr2.size())
                break;
        }
        System.out.println(Arr1.toString());//выводим результат
    }
}

