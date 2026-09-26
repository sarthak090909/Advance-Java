

import java.util.Collections;
import java.util.LinkedList;

public class Linked_List
{
    public static void main(String args[])
    {
        LinkedList<Integer>a=new LinkedList<>();
        a.add(5);a.add(7);a.add(9);
        a.add(2);
        a.add(0,100);a.addFirst(1);
        System.out.println("Max:="+Collections.max(a));

        System.out.println(a);
        System.out.println("value at index 6:="+a.get(6));
    }
}