package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StringOperation{
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> kids =new LinkedList<>();
        int[] arr =candies;
        Arrays.sort(arr);
        for (int i = 0; i <candies.length ; i++) {
            if (candies[i]+extraCandies>=arr.length-1){
                kids.add(true);
            }else {
                kids.add(false);
            }
        }
        return kids;
    }
    public static int[] get(int[] nums){
        int[] arr = new int[nums.length*2];
        for (int i = 0; i < nums.length ; i++) {
            arr[i]=nums[i];
        }
        int count =0;
        for (int i = nums.length; i < arr.length; i++) {
            arr[i]=nums[count];count++;
        }
        return arr;
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> li =new ArrayList<>();

        int max = 0;
        int index =0;


        for (int i = 0; i < matrix.length; i++) {
            int min =1000000;
            List<Integer> search =new ArrayList<>();
            for (int j = 0; j < matrix[0].length; j++) {
                int entry =matrix[i][j];
                search.add(entry);
                min=Math.min(min,entry);
            }
            if (min>max){
                max =min;
                index=search.indexOf(min);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][index]>max){
                return li;
            }
        }
        li.add(max);
        return li;
    }

    public static void main (String[]args){
            int[] arr = {12, 1, 12};
            int[][] arr2 = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};

        System.out.println(luckyNumbers(arr2));
    }
}

