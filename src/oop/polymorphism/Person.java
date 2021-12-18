package oop.polymorphism;

public class Person implements Student,FootBaller {



        @Override
        public void study() {
            System.out.println("person is studying");
        }

        @Override
        public  void tournament() {
            System.out.println("person is playing tournament");
        }

}
