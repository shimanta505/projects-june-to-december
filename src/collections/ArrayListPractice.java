package collections;

import snakeGame.GameEntry;

import java.util.ArrayList;

public class ArrayListPractice {


    public static void main(String[] args) {
        ArrayList<Integer> names = new ArrayList<>();



        for (int i = 0; i < 5 ; i++) {
            names.add(i);
        }
        names.add(8);
        System.out.println(names);
//        for (int i = 0; i <names.size() ; i++) {
//            for (int j = 0; j <names.size()-1-i ; j++) {
//
//                if (names.get(j)<names.get(j+1)){
//                    int tamp =names.get(j);
//                    names.set(j,names.get(j+1));
//                    names.set(j+1,tamp);
//                }
//            }
//        }
        System.out.println(names.indexOf(2));

    }
}
