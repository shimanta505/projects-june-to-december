public class MathPractice {

    public static String numberToN(int x){
        if (x>0&&x<4){
            return " prime number";
        }
        for(int i =2;i <x;i++){
            if (x%i==0){
                return "not a prime number";
            }
        }
        return "prime number";
    }
    public static String numberToHalfN(int x){
        if (x>0&&x<4){
            return " prime number";
        }
        for(int i =2;i <=x/2;i++){
            if (x%i==0){
                return "not a prime number";
            }
        }
        return "prime number";
    }
    public static String NumberToRootN(int x){
        if (x>0&&x<4){
            return " prime number";
        }
        for (int i =2;i <=Math.sqrt(x);i++){
            if (x%i==0){
                return "not a prime number";
            }
        }
        return "prime number";
    }
    public static String LSDNumber(int x){
        String number ="";
        int[] arr =new int[10];

        for (int i =2;i<=x;i++){
            if (x%i==0){
                x/=i;i-=1;
                int fnumber =arr[i]++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                number+=Integer.toString(i+1)+"#"+Integer.toString(arr[i])+",";
            }
        }
        return number;
    }
    public static int LSDNumberCount(int x){
        int count =0;
        for (int i =2;i<=x;i++){
            if (x%i==0){
                x/=i;i-=1;
                count++;
            }
        }
        return count;
    }
    public static void PrimeFactor(long x){
        int max =0;
        for (long i =2;i < x;i++){
            if (x%i==0){
                x/=i;
                System.out.println(i);
            }
        }
    }
    public static int maxOfThird(int[]arr){
        int[] maxCount =new int[3];
        int count_i =0;
        int max =0;
        for (int j=0;j<3;j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    count_i = i;
                }
            }
            arr[count_i] = 0;
            count_i = 0;
            maxCount[j]=max;
            max=0;
        }
        return maxCount[2];
    }
    public static int[] decompressRLElist(int[] nums) {

        int count=0;

        for(int i =0;i< nums.length;i+=2){
            count+=nums[i];
        }
        int[] arr=new int[count];

        int arrAdd =0;
        for (int i =0;i <nums.length;i++){
            int j =0;
            while(j<nums[i]){
                arr[arrAdd]=nums[i+1];j++;arrAdd++;
            }
            i++;
        }

        return arr;
    }


    public static void main(String[] args) {
        int target =65;
//        System.out.println(numberToN(target));
//        System.out.println(numberToHalfN(target));
//        System.out.println(NumberToRootN(target));
//        System.out.println(LSDNumber(target));
//        System.out.println(LSDNumberCount(target));
//        PrimeFactor(600851475143L);
        int[] arr = {1,2,3,4};
        String s ="codeleet";
//        System.out.println(maxOfThird(arr));
        System.out.println(decompressRLElist(arr));

    }
}

