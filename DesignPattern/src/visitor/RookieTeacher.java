package visitor;

import java.util.List;

public class RookieTeacher extends Teacher {

    @Override
    public void visit(Home studentHome) {
        System.out.println("こんにちは");

    }

    @Override
    public void visit(TanakaHome studentHome) {
        studentHome.praisedChild();
    }

    @Override
    public void visit(SuzukiHome studentHome) {
        studentHome.reprovedChild();
    }

}
