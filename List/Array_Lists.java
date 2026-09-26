import java.util.ArrayList;
import java.util.Collections;

public class Array_Lists {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        a.add(8);
        a.add(9);
        a.add(10);
        a.addFirst(1);
        a.addLast(20);

        System.out.println("Min = " + Collections.min(a));
        System.out.println(a);

        System.out.println("Value at index 4 = " + a.get(4));
        System.out.println("Size = " + a.size());

        int sum = 0;

        for (int i = 0; i < a.size(); i++) {
            sum = sum + a.get(i);
        }

        System.out.println("Sum = " + sum);
    }
}