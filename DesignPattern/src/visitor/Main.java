package visitor;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Teacher teacher = new RookieTeacher();
        SuzukiHome suzukiHome = new SuzukiHome();
        TanakaHome tanakaHome = new TanakaHome();
        suzukiHome.accept(teacher);
        tanakaHome.accept(teacher);
    }

}
