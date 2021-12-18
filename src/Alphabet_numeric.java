public class Alphabet_numeric {
    public static String StringCompression(String a){
        String input ="";
        int count =1;
        for (int i =0;i<a.length();i++){
            for (int j =i +1;j<a.length();j++) {
                if (a.charAt(i) != a.charAt(j)) {
                    i=j-1; j=a.length();
                } else if (a.charAt(i) == a.charAt(j)) {
                    count++;i=j;
                }
            }
            input+=a.charAt(i)+Integer.toString(count);count=1;
        }
        if (input.length()>a.length()||input.length()==a.length()){
            return a;
        }

        return input;
    }
    public static boolean Anagram(String f,String s){
        int[] arr =new int[256];
         if (f.length()!=s.length()){
             return false;
         }
         for (int i =0;i<f.length();i++){
             char first =f.charAt(i);
             char second =s.charAt(i);

             int findex =arr[first]++;
             int sindex =arr[second]--;
         }
         for (int i =0;i <arr.length;i++){
             if (arr[i]!=0){
                 return false;
             }
         }
         return true;
    }
    public static void main(String[] args) {

        String a ="aaaabbbcccccd";


        String ana1 ="aabc";
        String ana2 ="abcaaa";
        String ana3 ="We promptly judged antique ivory buckles for the next prize";
        String jewels ="aA";
        String stones ="aAbcdassA";
        int [] arr ={1,2,3,4,5,6,7,8,9,10};
//        System.out.println(HackerRank.max(arr,3));
//        int i =s.charAt(0);
//        System.out.println(StringCompression(a));
//        System.out.println(Anagram(ana1,ana2));
//        System.out.println(HackerRank.makingAnagrams(ana1,ana2));
//        System.out.println(HackerRank.anagram(ana2));
//          System.out.println(HackerRank.pangrams(ana3));
//        System.out.println(HackerRank.max(arr,3));
        System.out.println(HackerRank.numJewelsInStones(jewels,stones));


    }
}
