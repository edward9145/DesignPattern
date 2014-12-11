package proxy;

import java.util.Calendar;

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
        Calendar now = Calendar.getInstance();
        if (Calendar.AM == now.get(Calendar.AM_PM)) {
            //午前中は山田先生に聞く
              System.out.print("答えは「");
            yamada.question3();
            System.out.println("」となります。");
        } else {
            //午後からは返答を明日にする
              System.out.println("明日、返答します。");
        }
    }

}
