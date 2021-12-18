package leetcode;

public class MaximumNumber {

    public int maxScore(String s) {

        int[] zero =new int[s.length()];
        int[] one =new int[s.length()+1];

        int countZero=0;
        int countOne=0;

        int maximum =0;
        for (int i =0;i<s.length()-1;i++){
            if (s.charAt(i)=='0'){
                countZero++;zero[i]=countZero;
            }
        }
        for (int i =s.length()-1;i>=1;i--){
            if (s.charAt(i)=='1'){
                countOne++;one[i]=countOne;
            }
        }
        for (int i=0;i<s.length();i++){
            int count =zero[i]+one[i+1];
            maximum =Math.max(maximum,count);
        }
        return maximum;
    }
    public boolean squareIsWhite(String coordinates) {

        int position =0;

        for (int i =0;i<=coordinates.charAt(0)-'a';i++){
            if (i%2==0){
                position=0;
            }else {
                position=1;
            }
        }
        for (int i =0;i<coordinates.charAt(1)-'1';i++){
            position++;
        }
        if (position%2==0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        MaximumNumber maxScore1 =new MaximumNumber();
//        System.out.println(maxScore1.maxScore("011101"));
//        System.out.println(maxScore1.squareIsWhite("c7"));
    }
}
