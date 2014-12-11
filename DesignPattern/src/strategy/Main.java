package strategy;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Human a = new Human("A", 168, 55, 20);
        Human b = new Human("B", 170, 53, 19);
        MyClass m1 =  new MyClass(new AgeComparator());
        MyClass m2 =  new MyClass(new HeightComparator());
        MyClass m3 =  new MyClass(new WeightComparator());
        System.out.println("age: " + m1.compare(a, b));
        System.out.println("height: " + m2.compare(a, b));
        System.out.println("weight: " + m3.compare(a, b));

    }

}
