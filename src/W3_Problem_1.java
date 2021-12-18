public class W3_Problem_1 {

    public static int MaxOfThree(int x,int y, int z){
        if (x>y && y>z || x>z && z>y){
            return x;
        }
        else if(y>x && x>z || y>z && z>x){
            return y;
        }
        else if(z>x && x>y || z>y && y>x) {
            return z;
        }
        else return 0;
    }
    public static float AvgOfThree(float x,float y,float z){
        return ((x+y+z)/3);
    }
    public static int AvgOfThree(int x,int y,int z){
        return ((x+y+z)/3);
    }

    public static String MidNumber(String a){
        int number =Integer.parseInt(a);
        String result ="";

        if(number%2==0){
            result+=a.charAt(a.length()/2);
        }
        else{
            result+=a.charAt(a.length()/2);
            result+=a.charAt((a.length()/2)+1);
        }
        return result;
    }

    public static void main(String[] args) {
        int first =2;
        int second =5;
        int third =10;

        int result =MaxOfThree(first,second,third);
        System.out.println(result);

        String midPoint ="557";
        System.out.println(MidNumber(midPoint));
    }
}
