import java.util.Arrays;

public class UniqueChar {

    public static boolean UniqueCharSearch(String s){

        for (int i =0;i<s.length();i++){

            for (int j =i+1;j<s.length();j++){
                if (s.charAt(j)==s.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean UniqueCharSearch2(String s){
        char[] ch =s.toCharArray();
        Arrays.sort(ch);
        for (int i =0;i<ch.length-1;i++){
            if (ch[i]==ch[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

//        String name ="s";
//        char c ='B';
//        String[] arr ={"a","c","b","h","g","j","i"};
//        Arrays.sort(arr);
//        for (int i =0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        String name ="acbedhg";
//        char[] ch =name.toCharArray();
//        Arrays.sort(ch);
//        for (int i =0;i < ch.length;i++){
//            System.out.println(ch[i]);
//        }
        String search ="abcdeff";
        System.out.println(UniqueCharSearch2(search));

    }
}
