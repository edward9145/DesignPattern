package observer;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Teacher narita = new Teacher("成田先生");
        Teacher sasagi = new Teacher("佐々木先生");
        Student taro = new Student("太郎");
        taro.addObserver(narita);
        taro.addObserver(sasagi);
        taro.run(10);
    }

}
