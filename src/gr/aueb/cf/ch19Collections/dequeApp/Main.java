package gr.aueb.cf.ch19Collections.dequeApp;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        Queue<String> myQueue = new Queue<>();

        myQueue.enQueue("White Car");
        myQueue.enQueue("Black car");
        myQueue.enQueue("Blue Car");

        String car = myQueue.deQueue();
        System.out.println("FIFO car Returned: " + car);
        myQueue.forEach(System.out::println);



        myStack.push(1);
        myStack.push(3);
        myStack.push(2);
        myStack.push(5);

        int n = myStack.pop();

        System.out.println("Returned from pop() " + n);

        myStack.forEach(System.out::println);
    }
}
