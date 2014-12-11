package state;

public class BadMoodState implements State {

    /**
     * 朝のあいさつです。機嫌の悪いときは、ぶっきらぼうに応えます。
     */
    @Override
    public String morningGreet() {
        return "おお";
    }

    /**
     * 冬の防寒方法です。機嫌の悪いときはももひきをはきます。
     */
    @Override
    public String getProtectionForCold() {
        return "ももひき";
    }

}
