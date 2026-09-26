import java.util.Stack;

public class stacks {
    public static void main(String args[])
    {
        Stack<Integer> s=new Stack<>();
        s.push(1);s.push(2);s.push(3);s.push(4);s.push(2);
        System.err.println(s);
        s.pop();
        System.err.println(s);
    }
}
