package sortingAlgo;

public class MargeSort {
    public static void margeSort(int[] arr,int start,int end){
        if(start<end){
            int mid = start+(end-start)/2;
            margeSort(arr,start,mid);
            margeSort(arr,mid+1,end);
            marge(arr,start,mid,end);
        }
    }
    static void marge(int[] arr,int start,int mid,int end){
        int first = mid - start + 1;
        int second = end - mid;

        int[] arr1 = new int[first];
        int[] arr2 = new int[second];

        for (int i = 0; i < first; ++i)
            arr1[i] = arr[start + i];
        for (int j = 0; j < second; ++j)
            arr2[j] = arr[mid + 1 + j];


        int i = 0, j = 0;
        int index = start;
        while (i < first && j < second) {
            if (arr1[i] <= arr2[j]) {
                arr[index] = arr1[i];
                i++;
            }
            else {
                arr[index] = arr2[j];
                j++;
            }
            index++;
        }
        while (i < first) {
            arr[index] = arr1[i];
            i++;
            index++;
        }

        while (j < second) {
            arr[index] = arr2[j];
            j++;
            index++;
        }
    }
}
