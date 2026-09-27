import java.util.Deque;
import java.util.LinkedList;

public class Dequee {
    public static void main(String args[])
    {
        Deque<Integer> d=new LinkedList<>();
        d.add(5);d.add(7);d.add(3);
        System.out.println(d);
        d.addLast(45);d.addFirst(18);
        System.out.println(d);

    }
}
