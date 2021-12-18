package leetcode;

public class Encrypt {
    public static void main(String[] args) {
        String name ="xyz";
        int offSet =29;

        System.out.println(encryptedString(name,offSet));
    }
    public static String encryptedString(String name,int offSet){
        char[] ch =name.toCharArray();
        char[] output =new char[name.length()];
        int i =0;
        for (char c:ch){
            int first =c-'a';
            int calculate = first + offSet;
            if (calculate>=26){
                calculate%=26;
            }

            output[i]= (char) (97+calculate);i++;
        }
        String encrypted ="";
        for (char c:output){
            encrypted+=c;
        }
        return encrypted;
    }
}
