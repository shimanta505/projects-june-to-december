public class String_1108 {
    public static void main(String[] args) {
        String address ="255.100.50.0";

        for (int i = 0;i<address.length();i++){
            if (address.charAt(i) == '.') {
                System.out.print("[.]");
            }
            else{
                System.out.print(address.charAt(i));
            }
        }


    }
}
