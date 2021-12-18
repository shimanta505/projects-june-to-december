package leetcode;

public class countConsistentStrings_1684 {
    public static int countConsistentStrings(String allowed, String[] words) {
        int[] cons =new int[26];
        int count =0;
        for (int i =0;i<allowed.length();i++){
            cons[allowed.charAt(i)-'a']=1;
        }
        for (int i=0;i< words.length;i++){
            char[] match =words[i].toCharArray();
            for (int j =0;j< match.length;j++){
                if (cons[match[j]-'a']==0){
                    count++;break;
                }
            }
        }
        return words.length-count;
    }
        public static boolean areOccurrencesEqual(String s) {
        int chAmount =0;
        char[] c =s.toCharArray();
        int[] arr =new int[26];
        for (int i =0;i<c.length;i++){
            int first = c[i];
            int findex = arr[first - 'a']++;
        }
        for (int i =0; i< arr.length;i++){
            if (arr[i]!=0){
                if (chAmount==0){
                    chAmount=arr[i];
                }
                else if (arr[i]!=chAmount){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean checkZeroOnes(String s) {

        int one =0;
        int temOne =0;
        int zero =0;
        int temZero =0;

        for (int i =0;i<s.length();i++){
            if (s.charAt(i)=='1'){
                one++;
            }
            else if (s.charAt(i)=='0'){
                zero++;
            }
            if (s.charAt(i)!='1'){
                temOne=Math.max(one,temOne);one=0;
            }
            else if (s.charAt(i)!='0'){
                temZero=Math.max(zero,temZero);zero=0;
            }

            temOne=Math.max(one,temOne);
            temZero=Math.max(zero,temZero);
        }
        if (temOne>temZero){
            return true;
        }
        return false;
    }
    public static String thousandSeparator(int n) {

        String input =Integer.toString(n);
        int count =0;
        String result = "\"";
        if (input.length()<=3){
            return result + (input + "\"");
        }
        for (int i =input.length()-1;i>=0;i--){
            result+=input.charAt(i);count++;
            if (count==3){
                result+=".";count=0;
            }
        }
        result+="\"";
        StringBuilder s1 =new StringBuilder();
        s1.append(result);
        s1.reverse();
        return s1.toString();
    }
    public static String sortSentence(String s) {
        String[] add =new String[10];
        String input ="";
        String output ="";

        for(int i =0;i<s.length();i++){
            int first =s.charAt(i);
            if(first>48&&first<57){
                add[first-48]=input + " ";i++;
                input ="";
            }else{
                input+=s.charAt(i);
            }
        }

        for (int i =0;i<add.length;i++){
            if (add[i]!=null) {
                output += add[i];
            }
        }

        return output.trim();
    }

    public static void main(String[] args) {
        String[] s ={"ad","bd","aaab","baa","badab"};
//        StringBuilder s1 =new StringBuilder();
//        s1.append(s);
//        s1.reverse();
        int ss =1234;
//        System.out.println(areOccurrencesEqual(s));
//        System.out.println(s.length());
//        System.out.println(checkZeroOnes(s));
//        System.out.println(thousandSeparator(ss));
        String a ="is2 sentence4 This1 a3";
        System.out.println(sortSentence(a));

    }

}
