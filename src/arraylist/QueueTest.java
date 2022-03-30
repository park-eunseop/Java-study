package arraylist;


import java.util.ArrayList;
import java.util.Queue;

class MyQueue{
    private ArrayList<String> myQueue = new ArrayList<>();

    /**
     * first in first out
     */
    public void enQueue(String data){
        myQueue.add(data);
    }

    public String deQueue(){
        int size = myQueue.size();
        if (size == 0){
            System.out.println("큐가 비어있습니다.");

            return null;
        }
        return myQueue.remove(0);
    }


}


public class QueueTest {
    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();

        myQueue.enQueue("first");
        myQueue.enQueue("second");


        System.out.println(myQueue.deQueue());
    }
}
