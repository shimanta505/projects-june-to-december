package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrequencySort {
    public static int[] frequencySort(int[] nums) {
        int[] arr =new int[100];

        for (int i = 0; i < nums.length; i++) {
            int first =nums[i];
            arr[first]++;
        }
        List<Integer> list =new ArrayList();
        for (int i = arr.length-1;i >=0; i--) {
            int min =arr[i];
            int get =0;
            for (int j = i-1; j >=0; j--) {
                if(arr[i]!=0 && min>arr[j]){
                    min = arr[j];
                    get =j;
                }
            }
           list.add(get);
            arr[get]--;
        }
        int[] output = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            output[i] = list.get(i);
        }

        return output;
    }

    public static void main(String[] args) {
        int[] arr ={1,1,2,2,2,3};
        for (int i:frequencySort(arr)){
            System.out.println(i);
        }
    }
}
