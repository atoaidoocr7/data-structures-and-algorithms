package searching.binarysearch;

import java.util.List;

public class BinarySearch<T> {
    public T binarySearchIterative(List<T> items, T target){
        return null;
    }

    public static void main(String[] args) {
        BinarySearch<Integer> binarySearch = new BinarySearch<>();
        Integer target = binarySearch.binarySearchIterative(null, 7);
        System.out.println("Target is: " + target);
    }
}
