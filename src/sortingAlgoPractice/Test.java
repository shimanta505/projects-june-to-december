package sortingAlgoPractice;

public class Test {
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        QuickSort.quickSort(arr,0,arr.length-1);
        for (int i:arr){
            System.out.println(i);
        }
    }

}
