public class Recurtion_Practice {
    public static void main(String[] args) {

        int result =addNumbers(10);
        int result2 =MyMethod.multiplyNumbers(4);
        System.out.println(result);
        System.out.println(result2);




    }
    public static int addNumbers(int x){
        if (x>0){
            return x +addNumbers(x-1);
        }
        return x;
    }
}
class MyMethod{
    public static int multiplyNumbers(int x){
        if (x>0){
            return x *multiplyNumbers(x-1);
        }
        return 1;
    }
}