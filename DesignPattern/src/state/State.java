package state;

public interface State {


    /**
     * 朝の挨拶を返すメソッドを定義する
     * @return
     */
    public String morningGreet();

    /**
     * 寒いときの対策を返すメソッドを定義する
     * @return
     */
    public String getProtectionForCold();

}
