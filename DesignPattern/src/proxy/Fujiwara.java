package proxy;

public class Fujiwara implements Teacher {

    private Teacher yamada = new Yamada();

    @Override
    public void question1() {
        System.out.println("それは「～～解答1～～」です。");
    }

    @Override
    public void question2() {
        System.out.print("それは「");
        yamada.question2();
        System.out.println("」です。");
    }

    @Override
    public void question3() {
        System.out.print("答えは「");
        //藤原先生には答えられないので、山田先生に聞く
        yamada.question3();
        System.out.println("」となります。");

    }

}
