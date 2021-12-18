public class Practice_Static {

    public static void main(String[] args) {

        cat cat1 =new cat();

        cat1.name="tom";
        cat1.weight=10;
        cat1.information();

    }
}
class cat{
    String name;
    int weight;
    String legs;
    String eyes;

    public void information() {
        System.out.println("name " + name + " weight " + weight + " " + legs + " " + eyes);
    }

}




