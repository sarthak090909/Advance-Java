import java.util.HashSet;

public class HashSets
{
    public static void main(String args[])
    
    {
        HashSet<Integer> h=new HashSet<>();

        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        h.add(50);

        System.out.println(h);

        System.out.println("Size := "+h.size());
        System.out.println("Contains 30 := "+ h.contains(30));

        h.remove(10);
        System.err.println("After removing 10:" + h);


    }
}