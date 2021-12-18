package sortingAlgo;

public class SelectionSort {

    static int[] sort(int[] arr){

        for (int i = 0; i < arr.length-1 ; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min]>arr[j]){
                    min = j;
                }


            }
            int temp =arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr ={64,25,12,22,11};
        int[] arr2 =sort(arr);
        for (int i:sort(arr)){
            System.out.println(i);
        }
    }
}
