package HashTable.DesignHashSet_705;

/**
 705. Design HashSet

 Design a HashSet without using any built-in hash table libraries.
 To be specific, your design should include these functions:
 add(value): Insert a value into the HashSet.
 contains(value) : Return whether the value exists in the HashSet or not.
 remove(value): Remove a value in the HashSet. If the value does not exist in the HashSet, do nothing.

 Example:
 MyHashSet hashSet = new MyHashSet();
 hashSet.add(1);
 hashSet.add(2);
 hashSet.contains(1);    // returns true
 hashSet.contains(3);    // returns false (not found)
 hashSet.add(2);
 hashSet.contains(2);    // returns true
 hashSet.remove(2);
 hashSet.contains(2);    // returns false (already removed)

 Note:
 All values will be in the range of [0, 1000000].
 The number of operations will be in the range of [1, 10000].
 Please do not use the built-in HashSet library.
 */

public class MyHashSet {
    int[] bitArr;
    private static final int MAX = 100000;
    private static final int INT_SIZE = Integer.SIZE;

    /** Initialize your data structure here. */
    public MyHashSet() {
        bitArr = new int[MAX / INT_SIZE + 1];
    }

    public void add(int key) {
        int ind = key / INT_SIZE;
        int bit = key % INT_SIZE;
        int bitMask = 1 << bit;
        bitArr[ind] |= bitMask;
    }

    public void remove(int key) {
        int ind = key / INT_SIZE;
        int bit = key % INT_SIZE;
        int bitMask = ~(1 << bit);
        bitArr[ind] &= bitMask;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int ind = key / INT_SIZE;
        int bit = key % INT_SIZE;
        int bitMask = 1 << bit;
        return (bitArr[ind] & bitMask) != 0;
    }
}
