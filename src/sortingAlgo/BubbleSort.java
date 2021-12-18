package sortingAlgo;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            Boolean check =false;
            for (int j = 0; j < arr.length-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]= temp;check = true;
                }
            }
            if (!check){
                break;
            }
        }
    }
}
