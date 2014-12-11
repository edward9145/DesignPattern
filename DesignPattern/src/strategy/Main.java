package strategy;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Human a = new Human("A", 168, 55, 20);
        Human b = new Human("B", 170, 53, 19);
        MyClass myclass =  new MyClass(new AgeComparator());
        myclass.compare(a, b)

    }

}
