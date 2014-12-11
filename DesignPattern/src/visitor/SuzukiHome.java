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

    /**
     * 訪問者を受け入れるメソッド
     */
    @Override
    public void accept(Teacher teacher) {
       teacher.visit(this);
    }

}
