package packages.oops;
public class Inheritance {
    protected void name(){
        System.out.println("i am shimanta");
    }
    protected static int Fibonacci_Problem2(int x){
        int ans =0;
        int first =1;
        int second =1;
        while (second<x){
            if (second%2==0){
                ans+=second;
            }
            int third =first+second;
            first=second;
            second=third;
        }
        return ans;
    }

    protected void loan(){
        System.out.println("you have a big loan");
    }

}
