package Design.ImplementStackusingQueues_225;

import java.util.*;

public class MyStack {
    Queue<Integer> inQueue;
    Queue<Integer> outQueue;

    /** Initialize your data structure here. */
    public MyStack() {
        inQueue = new LinkedList<Integer>();
        outQueue = new LinkedList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        inQueue.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (inQueue.size() > 1) {
            outQueue.offer(inQueue.poll());
        }
        int element = inQueue.poll();

        Queue temp = inQueue;
        inQueue = outQueue;
        outQueue = temp;

        return element;
    }

    /** Get the top element. */
    public int top() {
        while (inQueue.size() > 1) {
            outQueue.offer(inQueue.poll());
        }
        int element = inQueue.peek();

        outQueue.offer(inQueue.poll());

        Queue temp = inQueue;
        inQueue = outQueue;
        outQueue = temp;

        return element;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return inQueue.isEmpty();
    }
}
