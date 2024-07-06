package searching.binarysearch;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public int iterativeBinarySearch(List<Integer> items, int  target){
        int start = 0, end = items.size() - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if (items.get(mid).equals(target)) return mid;
            else if (target < items.get(mid)) end = mid -1;
            else start = mid + 1;
        }
        return -1;
    }

    public int recursiveBinarySearch(List<Integer> items, int target, int start, int end){
        if(start > end) return -1;
        int mid = (start + end) / 2;
        if (items.get(mid) == target) return mid;
        else if (target < items.get(mid))
            return recursiveBinarySearch(items, target, start, mid -1);
        return recursiveBinarySearch(items, target, mid + 1, end);
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        List<Integer> items = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int target = binarySearch.iterativeBinarySearch(items, 5);
        System.out.println("Target is: " + target);
        target = binarySearch.recursiveBinarySearch(items, 5, 0, items.size()-1);
        System.out.println("Target is: " + target);
    }
}
