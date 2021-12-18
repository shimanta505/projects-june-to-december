public class BaseballGame {
    public static void main(String[] args) {
        String[] ops ={"5","-2","4","C","D","9","+","+"};
        int[] countNumber =new int[ops.length];
        int count =0;
        int result=0;
        int pushValue =0;

        for(int i =0;i<ops.length;i++){
            if (ops[i].equals("C")){
                countNumber[pushValue-1]=0;pushValue--;
                count--;
            }
            else if(ops[i].equals("D")){
                countNumber[pushValue]=countNumber[pushValue-1]*2;pushValue++;
                count++;
            }
            else if (ops[i].equals("+")){
                countNumber[pushValue]=countNumber[pushValue-1]+countNumber[pushValue-2];pushValue++;
                count++;
            }
            else {
                countNumber[pushValue]= Integer.parseInt(ops[i]);pushValue++;
                count++;
            }
        }
        for (int i =0;i<count;i++){
            result+=countNumber[i];
        }
        System.out.println(result);
    }
}
