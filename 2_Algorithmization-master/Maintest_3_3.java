import java.util.ArrayList;
//Сортировка выбором. Дана последовательность чисел.Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.
public class Maintest_3_3 {
    public static void main(String[] args) {
        ArrayList<Integer> Arr1 = new ArrayList<Integer>();
        for (int i = 1; i <=10; i++)
            Arr1.add(i*2);

        System.out.println(Arr1.toString());//выводим массив 1

        for(int i =0; i<Arr1.size()/2;i++){
            int q = Arr1.get(i);
            Arr1.set(i,Arr1.get(Arr1.size()-1-i));
            Arr1.set(Arr1.size()-1-i,q);
        }

        System.out.println(Arr1.toString());//выводим результат
    }
}
