package problems.searching.binarysearch;

import java.util.Arrays;
import java.util.List;

public class FirstAndLastOccurrence {

    public int firstOccurrence(List<Integer> items, int target){
        int start = 0, end = items.size() - 1;
        int result = -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if (items.get(mid) == target){
                result = mid;
                end = mid -1;
            }
            else if (target < items.get(mid)) end = mid -1;
            else start = mid + 1;
        }
        return result;
    }

    public int lastOccurrence(List<Integer> items, int target){
        int start = 0, end = items.size() - 1;
        int result = -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if (items.get(mid) == target){
                result = mid;
                start = mid + 1;
            }
            else if (target < items.get(mid)) end = mid -1;
            else start = mid + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> items = Arrays.asList(1, 1, 2, 3, 4, 4, 4, 4, 5, 6, 7, 8);
        FirstAndLastOccurrence fl = new FirstAndLastOccurrence();
        System.out.println("First occurrence: " + fl.firstOccurrence(items, 4));
        System.out.println("First occurrence: " + fl.lastOccurrence(items, 4));
    }
}
