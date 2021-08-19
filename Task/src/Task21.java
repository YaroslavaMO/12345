import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Task21 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите 5 чисел");
        int number1 = number.nextInt();
        int number2 = number.nextInt();
        int number3 = number.nextInt();
        int number4 = number.nextInt();
        int number5 = number.nextInt();
        Set<Integer> set = new HashSet<Integer>();
        set.add(number1);
        set.add(number2);
        set.add(number3);
        set.add(number4);
        set.add(number5);
        Iterator<Integer> iterator1 = set.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }


    }
}
