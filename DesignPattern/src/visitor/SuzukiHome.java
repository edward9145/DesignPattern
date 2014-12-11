package visitor;

public class SuzukiHome extends Home implements TeacherAcceptor{

    @Override
    public Object praisedChild() {
        System.out.println("あら、先生ったらご冗談を");
        return new Tea();
    }

    @Override
    public Object reprovedChild() {
        System.out.println("うちの子に限ってそんなことは・・・。");
        return null;
    }

    @Override
    public void accept(Teacher teacher) {
        // TODO 自動生成されたメソッド・スタブ

    }

}
