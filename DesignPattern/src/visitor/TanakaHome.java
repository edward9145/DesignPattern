package visitor;

public class TanakaHome extends Home implements TeacherAcceptor{

    @Override
    public Object praisedChild() {
        System.out.println("ありがとう、先生");
        return new Tea();
    }

    @Override
    public Object reprovedChild() {
        System.out.println("ご迷惑をかけて、すみませんでした");
        return new Tea();
    }

    @Override
    public void accept(Teacher teacher) {
        teacher.visit(this);
    }

}
