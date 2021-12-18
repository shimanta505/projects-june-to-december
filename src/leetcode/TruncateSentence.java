package leetcode;

import java.util.Arrays;

public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        String result ="";
        int count =0;

        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==32){
                count++;
            }
            if (count==k){
                break;
            }
            result+=s.charAt(i);
        }
        return result;
    }
    public static int subtractProductAndSum(int n) {
        String number = Integer.toString(n);
        int multi = 1;
        int add = 0;
        for (int i = 0; i < number.length(); i++) {
            int sum =Integer.parseInt(String.valueOf(number.charAt(i)));
            multi *=sum;
            add+=sum;
        }
        return multi-add;
    }
    public static String removeOuterParentheses(String s) {
        String result ="";
        int count =0;

        for(int i =0;i<s.length()-1;i++){
            if(s.charAt(i)=='('&&s.charAt(i+1)=='('){
                if(s.charAt(i)=='('&&s.charAt(i+1)==')'){
                    result+=s.charAt(i);
                    result+=s.charAt(i+1);
                }
                count++;
            }
            else if(s.charAt(i)==')'&&s.charAt(i+1)==')'){
                count--;
            }
            if(count>1){
                result+="(";count--;
            }else if(count<0){
                result+=")";count++;
            }
        }
        return result;
    }
    public static boolean halvesAreAlike(String s) {
        char[] ch =s.toCharArray();
        int count =0;

        for (int i =0;i<ch.length/2;i++){
            if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                count++;
            }
            else if (ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                count++;
            }

        }
        for (int i =ch.length/2;i<ch.length;i++){
            if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                count--;
            }
            else if (ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                count--;
            }

        }


        if (count ==0){
            return true;
        }
        return false;
    }



    public static void main(String[] args) {

//    System.out.println(subtractProductAndSum(234));
        System.out.println(halvesAreAlike("puKYyvdkFA"));
    }
}
