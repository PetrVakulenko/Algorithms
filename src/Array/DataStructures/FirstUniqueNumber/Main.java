package Array.DataStructures.FirstUniqueNumber;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,3,5};

        FirstUnique firstUnique = new FirstUnique(arr);
        firstUnique.showFirstUnique(); // return 809
        firstUnique.add(809);          // the queue is now [809,809]
        firstUnique.showFirstUnique(); // return -1
    }
}