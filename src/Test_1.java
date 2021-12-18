import packages.oops.Inheritance;


public class Test_1 extends Inheritance {



    protected void Loan(){
        System.out.println("from child class");
    }
    public static void main(String[] args) {
       Test_1 first =new Test_1();
       first.Loan();
       Programs sound =new Programs();
       sound.animalSound();

    }
}
class Programs {
    public void animalSound() {
        System.out.println("this thing use to solve problems");
    }
}

class java extends Programs {
    public void animalSound() {
        System.out.println("this is a oop program ");
    }
}

class javaScript extends Programs {
    public void animalSound() {
        System.out.println("This is a scripting language");
    }
}