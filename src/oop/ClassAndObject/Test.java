package oop.ClassAndObject;

public class Test {
    public static String largestOddNumber1(String num) {
    String input ="";
    int count =0;

          for(int i=num.length()-1;i>=0;i--){
              if (num.charAt(i)%2!=0){
                while (count<=i){
                    input+=num.charAt(count);count++;
                }return input;
             }
         }
          return "";
    }
    public static int[] sumZero(int n) {

        int[] num =new int[n];

        if(n==0){
            return num;
        }
        for (int i =0;i<n;i++){
            num[i]=(i*2)+(1-n);
        }

//        for (int i =0;i<n;i++){
//            if (i==0) {
//                num[0] =1-n;
//            }else{
//                num[i]=1;
//            }
//        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(sumZero(6));
    }
}
