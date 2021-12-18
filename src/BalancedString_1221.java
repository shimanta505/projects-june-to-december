public class BalancedString_1221 {
    public static void main(String[] args) {

        String split ="RRLLRRLLLRRL";

        int result = 0;

        for (int  i = 0;i < split.length();i++){

            if (split.charAt(i)=='R'){
                result+=1;
            }
            else if (split.charAt(i)=='L'){
                result-=1;
            }
        }
        if (result==0){
            System.out.println("balanced split");
        }
        else{
            System.out.println("not a balanced split");
        }
    }
}
