import java.util.LinkedList;
import java.util.Queue;

public class Queuee {
    public static void main(String args[])
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);q.add(3);q.add(4);
        System.out.println(q);
        q.remove();
        System.err.println(q);
    }
}
