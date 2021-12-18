public class ProjectEuler {
 public static int MultiplesOf3And5(int x){
    int count =0;
    for (int i =0;i <x;i++){
        if (i%3==0 || i%5==0){
            count+=i;
        }
    }
    return count;
 }
  public static int Fibonacci_Problem2(int x){
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

    public static void main(String[] args) {
        int target =4000000;
//        System.out.println(MultiplesOf3And5(target));
        System.out.println(Fibonacci_Problem2(target));

    }
}
