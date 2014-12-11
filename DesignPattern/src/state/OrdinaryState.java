package state;

public class OrdinaryState implements State {

    /**
     * 朝のあいさつです。通常は、男らしく応えます。
     */
    @Override
    public String morningGreet() {
        return "おっす！";
    }

    /**
     * 冬の防寒方法です。走るようです。
     */
    @Override
    public String getProtectionForCold() {
        return "走る";
    }

}
