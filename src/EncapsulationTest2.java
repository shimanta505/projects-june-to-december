
import packages.oops.Encapsulation.java.EncapsulationTest;

public class EncapsulationTest2 {
    public static void main(String[] args) {
        EncapsulationTest first =new EncapsulationTest();

        first.setAge(17);
        first.setName("oni");
        first.setReg(1221);

        System.out.println(first.getName());
        System.out.println(first.getReg());

    }
}
