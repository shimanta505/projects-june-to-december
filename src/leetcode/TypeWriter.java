package leetcode;

import java.util.ArrayList;

public class TypeWriter {
    public static int minTimeToType(String word) {

        char prev ='a';
        int count =0;
        int sum =0;

        for(int i =0;i <word.length();i++){

            count =Math.abs(prev-word.charAt(i));

            if (count>12){
                count=26-count;
                sum+=count+1;
            }else {
                sum+=count+1;
            }
            prev=word.charAt(i);count=0;
        }
        return sum;
    }
    public static String mergeAlternately(String word1, String word2) {
        char[] ch =new char[150];
        int count =0;
        String result="";
        for(int i =0;i<ch.length;i+=2){
            if (count==word1.length()){
                break;
            }
            ch[i]=word1.charAt(count);
            count++;
        }count=0;
        for(int i =0;i<ch.length;i++){
            if(count==word2.length()){
                break;
            }
            else if(ch[i]==0){
                ch[i]=word2.charAt(count);count++;
            }
        }
        for(int i =0;i<ch.length;i++){
            if(word1.length()+word2.length()==result.length()){
                break;
            }else if(ch[i]!=0){
                result+=ch[i];
            }
        }
        return result;
    }
    public static int canBeTypedWords(String text, String brokenLetters) {
        String add ="";
        int index =0;
        String[] arr = new String[text.length()];
        char[] ch = brokenLetters.toCharArray();


        for(int i =0;i<text.length();i++){
            if (text.charAt(i)==' '){
                arr[index]=add;index++;add="";
            }else{
                add+=text.charAt(i);
            }
        }arr[index]=add;
        int[] count =new int[index+1];
        if(brokenLetters.length()==0){
            return index+1;
        }

        for(int i =0;i<=index;i++){
            for (int j =0;j<ch.length;j++){
                String s =Character.toString(ch[j]);
                 if (arr[i].contains(s)){
                    count[i]=0;break;
                }else {
                    count[i]=1;
                }

            }
        }
        int result=0;
        for (int x:count){
            result+=x;
        }
        return result;
    }
    public static String sortSentence(String s) {
        String input ="";
        int count=s.charAt(s.length()-1)-'1';
        String[] sentence =new String[s.length()];

        for(int i =0;i<s.length()-1;i++){
            if(s.charAt(i+1)==' '){
                int index =s.charAt(i)-'1';
                 sentence[index]=input;input="";i++;
            }else{
                input+=s.charAt(i);
            }
        }sentence[count]=input;input="";
        for (int i =0;i<sentence.length;i++) {
            if(sentence[i]==null){
                break;
            }
            input += sentence[i] + " ";
        }
        return input.trim();
    }


    public static void main(String[] args) {

        System.out.println(sortSentence("Myself2 Me1 I4 and3"));
    }
}
