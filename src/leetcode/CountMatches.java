package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CountMatches {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index =0;
        if (ruleKey.charAt(0)==('c')){
            index=1;
        }else if (ruleKey.charAt(0)==('n')){
            index=2;
        }else {
            index =0;
        }
        int count =0;
        for (int i = 0; i < items.size() ; i++) {
          if (items.get(i).get(index).equals(ruleValue)){
              count++;
          }
        }
        return count;
    }

    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();

    }
}
