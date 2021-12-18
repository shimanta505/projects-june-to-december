package leetcode;

import java.util.ArrayList;

public class Maximum69Number {

    public static String replaceDigits(String s) {
        String result = "";

        char[] c =s.toCharArray();
        for (int i = 0; i < s.length(); i++) {

            if (c[i]>=48&&c[i]<58){
                int count =c[i-1]+(c[i]-48);
                char add =(char)count;
                result+=add;
            }else {
                result+=c[i];
            }

        }
        return result;
    }
    public static String reverseWords(String s){
        String add ="";
        int count =0;
        String[] repeat =new String[s.length()];

        for (int i =0;i<s.length();i++){
            add+=s.charAt(i);
            if (s.charAt(i)==' '||i ==s.length()-1){
                StringBuilder sb = new StringBuilder();
                sb.append(add);
                sb.reverse();
                if (i!=s.length()-1){
                    sb.deleteCharAt(0);
                }
                repeat[count]=sb.toString();
                sb.delete(0,sb.length());count++;add="";
            }
        }
        for (int i =0;i<count;i++){
            add+=repeat[i]+" ";
        }
        return add.trim();
    }
    public static int shortestToChar(String s, char c) {
        ArrayList<Integer> number = new ArrayList<>();

        for (int i =0;i<s.length();i++){
            if (s.charAt(i)==c){
                number.add(i);
            }
        }
        return 0;
    }



    public static void main(String[] args) {
        System.out.println(reverseWords("lets do it"));
    }
}
