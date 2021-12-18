package linkedList.problems;

public class Test {
    public static void main(String[] args) {
        ReverseAdd ra = new ReverseAdd();
        ra.addL1(2);
        ra.addL1(4);
        ra.addL1(3);
        ra.addL2(5);
        ra.addL2(6);
        ra.addL2(4);


//        ReverseAdd.ListNode temp =ra.addTwoNumbers(ra.l1, ra.l2);
//        while (temp!=null){
//            System.out.print(temp.val +" ");
//            temp = temp.next;
//        }
        char[] c1 ={'6','5'};
        char[] c2 ={'9','4','5'};
        System.out.println(ra.numString(c1,c2));
    }
}
