import java.util.Arrays;
import java.util.Locale;

public class HackerRank {

    public static int makingAnagrams(String s1, String s2) {
        int[] arr = new int[26];
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            char first = s1.charAt(i);
            int findex = arr[first - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            char second = s2.charAt(i);
            int sindex = arr[second - 'a']--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count += arr[i];
            } else if (arr[i] < 0) {
                count += (-1 * arr[i]);
            }
        }
        return count;
    }

    public static int anagram(String s) {

        if (s.length() % 2 != 0) {
            return -1;
        }
        int count = 0;
        int[] ch = new int[26];

        for (int i = 0; i < s.length() / 2; i++) {
            int first = s.charAt(i);
            int findex = ch[first - 'a']++;
        }
        for (int i = s.length() / 2; i < s.length(); i++) {
            int second = s.charAt(i);
            int sindex = ch[second - 'a']--;
        }
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] > 0) {
                count += ch[i];
            } else if (ch[i] < 0) {
                count += (-1 * (ch[i]));
            }
        }
        if (count % 2 == 0) {
            return count / 2;
        }
        return count % 2;
    }

    public static String pangrams(String s) {

        String re = s.replaceAll("\\s", "");
        String low = re.toLowerCase(Locale.ROOT);
        int[] arr = new int[26];

        for (int i = 0; i < low.length(); i++) {

            int first = low.charAt(i);
            int findex = arr[first - 'a']++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return "not pangram";
            }
        }
        return "pangram";
    }

    public static int max(int[] arr, int k) {
        int maxNum = 0;
        int count = 0;
        int kCount = k;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
            if (i == k - 1) {
                maxNum = Math.max(count, maxNum);
                count = 0;
                k += kCount;
            }
        }
        return maxNum;
    }

    //    public static String sortSentence(String s) {
//
//        int number = 0;
//        String[] store =new String[10];
//        String count = "";
//        for (int i = 1; i < s.length(); i++) {
//            count += s.charAt(i);
//            if (s.charAt(i) >=48 && s.charAt(i)<=57) {
//                int first =s.charAt(i)-48;
//                store[first]=count;
//                count = "";
//                number++;
//            }
//
//        }
//        store[number] = count;count="";
//
//        for (int i = 0; i < store.length; i++){
//
//        }
//    }
    public static int numJewelsInStones(String jewels, String stones) {      //leetcode
        int count = 0;

        for (int i = 0; i < stones.length();i++) {
            char c =stones.charAt(i);

            if (jewels.indexOf(c)> -1) {
                count++;
            }
        }
        return count;
    }

}
