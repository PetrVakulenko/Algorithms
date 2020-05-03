package Design.ImplementQueueusingStacks_232;

import Design.ImplementStackusingQueues_225.MyStack;

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        queue.peek();  // returns 1
        queue.pop();   // returns 1
        queue.empty(); // returns false
    }
}
