package sedgewick_algorithms.ProrityQueue;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {

    private Node first;
    private Node last;
    private int size;

    private class Node {
        Item item;
        Node next;
        Node prev;

        @Override
        public String toString() {
            return item.toString();
        }
    }

    private class DequeIterator implements Iterator<Item> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove is not supported on DequeIterator");
        }
    }

    // construct an empty deque
    public Deque() {
        size = 0;
    }

    // is the deque empty?
    public boolean isEmpty() {
        return first == null;
    }

    // return the number of items on the deque
    public int size() {
        return size;
    }

    // add the item to the front
    public void addFirst(Item item) {
        validItem(item);

        Node oldFirst = this.first;
        Node node = new Node();
        node.item = item;

        if (oldFirst != null) {
            first.next = oldFirst;
            oldFirst.prev = node;
        } else {
            this.last = node;
        }

        this.first = node;
        this.size++;
    }

    // add the item to the back
    public void addLast(Item item) {
        validItem(item);

        Node oldLast = last;
        Node node = new Node();
        node.item = item;

        if (oldLast != null) {
            node.prev = oldLast;
            oldLast.next = node;
        } else {
            this.first = node;
        }


        this.last = node;

        this.size++;
    }

    // remove and return the item from the front
    public Item removeFirst() {
        validDequeueSize();

        Node first = this.first;
        Node last = this.last;
        Node next = first.next;
        this.first = next;

        if (first == last) {
            this.last = null;
        } else {
            next.prev = null;
        }

        this.size--;

        return first.item;
    }

    // remove and return the item from the back
    public Item removeLast() {
        validDequeueSize();

        Node first = this.first;
        Node last = this.last;
        Node prev = last.prev;
        this.last = prev;

        if (first == last) {
            this.first = null;
        } else {
            prev.next = null;
        }

        this.size--;

        return last.item;
    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator() {
        return new DequeIterator();
    }

    private void validDequeueSize() {
        if (size == 0) {
            throw new NoSuchElementException("Deque is empty");
        }
    }

    private void validItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item could not be null");
        }
    }

    // unit testing (required)
    public static void main(String[] args) {
        //        Deque<String> test = new Deque<String>();
        //        test.addFirst("to");
        //        test.addFirst("be");
        //        test.removeLast();
        //        test.removeLast();
        //        test.addLast("not");
        //        for(String s: test)
        //        {
        //            System.out.print(s);
        //        }
        //        Iterator<String> i = test.iterator();
        //        while (i.hasNext())
        //        {
        //            String s = i.next();
        //            StdOut.println(s);
        //        }
        //        i.next();
        //String value = test.removeFirst();
        //System.out.print(value);

        Deque<Integer> test10 = new Deque<Integer>();
        test10.addFirst(1);
        test10.addLast(2);
        test10.addFirst(3);
        test10.addFirst(4);
        test10.removeFirst();
        test10.addLast(6);
        test10.removeFirst();
        test10.addFirst(8);
        test10.removeLast();
        for(Integer s: test10)
        {
            System.out.print(s);
        }
    }

}