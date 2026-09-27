import java.util.concurrent.ConcurrentHashMap;
public class chm {
    public static void main(String args[])
    {
        ConcurrentHashMap<Integer, String> c=new ConcurrentHashMap<>();

        c.put(1, "Java");
        c.put(2, "Python");
        c.put(3, "C++");

        System.out.println(c);

        System.out.println("Value of key 2 = "+ c.get(2));

        c.put(2, "Advanced Java");

        System.out.println("After updating: "+ c);

        c.remove(1);

        System.out.println("After removing key 1: "+ c);
    }
}
