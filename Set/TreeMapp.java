import java.util.TreeMap;

public class TreeMapp {
    public static void main(String args[])
    {
        TreeMap<Integer, String> t=new TreeMap<>();

        t.put(3, "Java");
        t.put(1, "Python");
        t.put(4, "C++");
        t.put(2, "SQL");

        System.out.println(t);

        System.out.println("Value of key  2 = "+ t.get(2));
        System.out.println("First Key = "+ t.firstKey());
        System.out.println("Last Key = "+ t.lastKey());

        t.remove(3);

        System.out.println("After removing key 3: "+t);

    }
}
