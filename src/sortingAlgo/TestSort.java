package sortingAlgo;

public class TestSort {
    public static void main(String[] args) {
        int[] arr ={9,8,7,6,5,4,3,2,2,1};
        MargeSort.margeSort(arr,0, arr.length-1);
        for (int i:arr){
            System.out.println(i);
        }
    }
}
