package memento;

/**
 * ひとつの計算を表すクラス。
 * @author apl02
 *
 */
public class Calc {

    private int temp = 0;

    /**
     * 足し算実行するメソッド
     * @param plus
     */
    public void plus(int plus){
        this.temp += plus;
    }

    /**
     * 途中経過をMementoとして取得するメソッド
     * @return
     */
    public Memento createMemento(){
        return new Memento(this.temp);
    }

    /**
     * Mementoから計算経過を取得しで、tempにセットする
     * @param memento
     */
    public void setMemento(Memento memento){
        this.temp = memento.result;
    }

    /**
     * 計算結果を取得するメソッド
     * @return
     */
    public int getTemp(){
        return this.temp;
    }

    /**
     * 途中経過を保持するMementoクラス
     * @author apl02
     *
     */
    public class Memento{
        /** 計算の途中経過を表す */
        private int result = -1;

        /**
         * 計算経過を引数に受け取るコンストラクタ
         * @param temp
         */
        Memento(int temp){
            this.result = temp;
        }
    }

}
