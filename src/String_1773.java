public class String_1773 {
    public static void main(String[] args) {

        String[][] items ={{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};

        String ruleKey ="color";   //type,color,name
        String ruleValue="silver";

        int j =0;
        int result =0;

        if (ruleKey=="color"){
            j =1;
        }else if(ruleKey=="name"){
            j=2;
        }
        else if(ruleKey=="type"){
            j=0;
        }

        for (int i =0;i < items.length;i++){
            if (items[i][j]==ruleValue){
                result+=1;
            }
        }

        System.out.println(result);




    }
}
