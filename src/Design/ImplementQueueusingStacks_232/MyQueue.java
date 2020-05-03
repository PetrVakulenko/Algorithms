package Design.ImplementQueueusingStacks_232;

import java.util.Stack;

/**
 232. Implement Queue using Stacks

 Implement the following operations of a queue using stacks.

 push(x) -- Push element x to the back of queue.
 pop() -- Removes the element from in front of queue.
 peek() -- Get the front element.
 empty() -- Return whether the queue is empty.
 Example:

 MyQueue queue = new MyQueue();

 queue.push(1);
 queue.push(2);
 queue.peek();  // returns 1
 queue.pop();   // returns 1
 queue.empty(); // returns false

 Notes:
 You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size,
   and is empty operations are valid.
 Depending on your language, stack may not be supported natively.
 You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
 You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).
 */

public class MyQueue {
    Stack<Integer> mainStack;
    Stack<Integer> altStack;

    /** Initialize your data structure here. */
    public MyQueue() {
        mainStack = new Stack<Integer>();
        altStack = new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        mainStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        // move all elements from main stack to alt stack to expose the first element
        // in the main stack.
        while (!mainStack.empty()) {
            altStack.push(mainStack.pop());
        }
        int front = altStack.pop();

        while(!altStack.empty()) {
            mainStack.push(altStack.pop());
        }
        return front;
    }

    /** Get the front element. */
    public int peek() {
        while (!mainStack.empty()) {
            altStack.push(mainStack.pop());
        }
        int front = altStack.peek();

        while(!altStack.empty()) {
            mainStack.push(altStack.pop());
        }
        return front;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return mainStack.empty();
    }
}
