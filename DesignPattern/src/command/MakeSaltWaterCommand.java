package command;

public class MakeSaltWaterCommand extends Command {

    @Override
    public void execute() {
        // 食塩水を作る実験
        beaker.mix();
        // 濃度をはかり、ノートに記述する
        System.out.println("食塩水を作る実験");
        beaker.note();
    }

}
