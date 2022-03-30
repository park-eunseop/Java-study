package arraylist;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<String> arrayStack = new ArrayList<>();

    /**
     * First In Last Out
     * @param data
     */

    public void push(String data) {
        arrayStack.add(data);
    }
    public String pop(){
        int size = arrayStack.size();
        if (size==0){
            System.out.println("스택이 비었음");
            return null;
        }
        return arrayStack.remove(size - 1);
    }
}
