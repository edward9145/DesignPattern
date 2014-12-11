package state;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        State s0 = new DefaultState();
        State s1 = new OrdinaryState();
        State s2 = new BadMoodState();
        StatePatternYumichan yumi = new StatePatternYumichan();
        yumi.changeState(s1);
        System.out.println(yumi.morningGreet());
        yumi.changeState(s2);
        System.out.println(yumi.getProtectionForCold());
    }

}
