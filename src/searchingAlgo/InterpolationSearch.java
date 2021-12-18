package searchingAlgo;

public class InterpolationSearch {

    static int interpolationSearch(int[] arr,int target){
        int start = 0;
        int end =arr.length-1;

        while (start<= end){
            int position = start +((target-arr[start])/(arr[end]-arr[start]))*(end-start);

            if (arr[position] == target){
                return position;
            }else if(arr[position]<target){
                start = position + 1;
            }else {
                end = position -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] arr ={20,40,60,80,100,120,140,160,180};
          int[] arr ={1,10,20,27,40,49,60,69,80};
        System.out.println(interpolationSearch(arr,49));
    }
}
