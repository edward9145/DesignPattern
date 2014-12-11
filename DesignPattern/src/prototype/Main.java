package prototype;

public class Main {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Teacher teacher = new Teacher();
        teacher.createManyCrystals();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}
