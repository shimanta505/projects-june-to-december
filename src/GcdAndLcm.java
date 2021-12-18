import java.util.Arrays;

public class GcdAndLcm {
    public static int Gcd(int x,int y){
       int modulus =0;
       int result =0;

       while (y>0){
           modulus=y%x;

           if (modulus!=0){
               result=modulus;
               modulus=x%modulus;
               y=modulus;
           }else{
               y=modulus;
               result=x;
           }
       }
       return result;
    }
    public static int Lcm(int x,int y){
            int modulus =1;
            int result =0;
            while (modulus>0){
                modulus=y%x;
                if (modulus!=0){
                    result=modulus;
                    modulus=x%modulus;

                }else{
                    modulus=0;
                    result=x;
                }
            }

        int lcm =(x*y)/result;
            return lcm;
    }
    public static int GcdToArray(int[]x){
        int dev =2;
        int result =0;
        for (int i =0;i<x.length;i++){

            if (x[i]%dev==0){

            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(Lcm(12,30));
    }
}
