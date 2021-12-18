package sortingAlgo;

public class LinearSearch {
    private static int linearSearch(int[] arr,int target){
        int first =0;
        int last =arr.length-1;

        while(first<=last){
            if (arr[first]==target){
                return first;
            }
            if (arr[last]==target){
                return last;
            }
            first++;
            last--;
        }
        return -1;
    }
    private static int forLoopSearch(int[] arr,int target){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr =new int[1000001];
        for (int i = 0; i <100001 ; i++) {
            arr[i]=i;
        }

        System.out.println(forLoopSearch(arr,100000));

        System.out.println(linearSearch(arr,100000));

    }
}
