package sorting;

import java.util.Arrays;

public class MergeSort{

  public static void mergeSort(int[] arr){
    int n = arr.length;
    if(n < 2) return;
    int mid = n /2;

    int[] left = new int[mid];
    int[] right = new int[n- mid];
    for(int i = 0; i < mid; i++) {
      left[i] = arr[i];
    }

    for(int i = mid; i < n; i++) {
      right[i-mid] = arr[i];
    }
    mergeSort(left);
    mergeSort(right);
    merge(arr, left, right);
    System.out.println("MERGED ARRAY IS: " + Arrays.toString(arr));
  }

  private static void merge(int[] mergedArr, int[] leftHalf, int[] rightHalf){
    int i = 0, j = 0, k = 0;
    while(i < leftHalf.length && j  < rightHalf.length){
      if(leftHalf[i] <= rightHalf[j]) {
        mergedArr[k++] = leftHalf[i++];
      }else{
        mergedArr[k++] = rightHalf[j++];
      }
    }
    if(i < leftHalf.length) populateArray(mergedArr, leftHalf, i, k);
    if(j < rightHalf.length) populateArray(mergedArr, rightHalf, j, k);
  }

  public static void populateArray(int[] bigArray, int[] smallArray, int smallIdx, int bigIdx){
    while(smallIdx < smallArray.length){
      bigArray[bigIdx++] = smallArray[smallIdx++];
    }
  }

  public static void main(String[] args){
    int[] nums = {8, 1, 4, 6, 2, 3, 7, 5};
    mergeSort(nums);
  }

}
