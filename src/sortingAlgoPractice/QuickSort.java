package sortingAlgoPractice;

public class QuickSort {
    public static void swap(int[] arr,int left,int right){

        int temp =arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    public static void quickSort(int[] arr,int start,int end){
        if (start<=end) {
            int pivot = arr[start];
            int left = start + 1;
            int right = end;

            while (left <= right) {
                if (arr[left] > pivot && arr[right] < pivot) {
                    swap(arr, left, right);
                } else if (arr[left] <= pivot) {
                    left++;
                } else if (arr[right] >= pivot) {
                    right--;
                }
            }
            swap(arr, start, right);
            quickSort(arr, start, right - 1);
            quickSort(arr, right + 1, end);
        }
    }
}
