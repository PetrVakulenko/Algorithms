package sedgewick_algorithms.ProrityQueue;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RandomizedQueue<Item> implements Iterable<Item> {
    private Item[] q; // store queue data
    private int N;

    // construct an empty randomized queue
    public RandomizedQueue() {
        this.q = (Item[]) new Object[1];
    }

    // is the randomized queue empty?
    public boolean isEmpty() {
        return N == 0;
    }

    // Resize an array
    private void resize(int newCap) {
        // init new queue
        Item[] newQ = (Item[]) new Object[newCap];

        // copy to new queue
        int i;
        for (i = 0; i < N; i++) {
            newQ[i] = this.q[i];
        }

        this.q = newQ;
    }

    // return the number of items on the randomized queue
    public int size() {
        return this.N;
    }

    // add the item
    public void enqueue(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }

        if (N == q.length) {
            this.resize(q.length * 2);
        }

        this.q[this.N++] = item;
    }

    // remove and return a random item
    public Item dequeue() {
        if(size() == 0) {
            throw new NoSuchElementException();
        }
        int rand = StdRandom.uniform(N);
        Item value = q[rand];

        if(rand != N-1) {
            q[rand] = q[N-1];
        }

        q[N-1] = null;

        N--;

        if(N > 0 && N <= q.length/4) {
            resize(q.length/2);
        }

        return value;
    }

    // return a random item (but do not remove it)
    public Item sample() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Item value = q[StdRandom.uniform(N)];
        if(N > 0 && N == q.length/4) {
            resize(q.length/2);
        }

        return value;
    }

    // return an independent iterator over items in random order
    public Iterator<Item> iterator() {
        return new RandomizedQueueIterator();
    }

    private class RandomizedQueueIterator implements Iterator<Item> {
        int[] order;
        int idx;

        public RandomizedQueueIterator() {
            order = new int[N];
            for (int i = 0; i < N; i++) {
                order[i] = i;
            }
            StdRandom.shuffle(order);
            idx = 0;
        }

        @Override
        public boolean hasNext() {
            return idx < order.length;
        }

        @Override
        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No next element");
            }

            Item item = q[order[idx]];
            idx++;

            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove is not supported");
        }
    }

    // unit testing (required)
    public static void main(String[] args) {
//        RandomizedQueue<String> test = new RandomizedQueue<String>();
//        test.enqueue("to");
//        test.enqueue("be");
//        test.enqueue("or");
//        test.enqueue("not");
//        System.out.print(test.sample());

            RandomizedQueue<String> test2 = new RandomizedQueue<String>();
            test2.enqueue("to");
            test2.enqueue("be");
            test2.enqueue("or");
            test2.enqueue("not");
            test2.enqueue("to2");
            test2.enqueue("lol2");
            test2.enqueue("roll2");
            test2.dequeue();
            test2.dequeue();
    }

}