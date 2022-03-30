package arraylist;

public class StackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push("first");
        stack.push("second");

        System.out.println(stack.pop());
    }
}
