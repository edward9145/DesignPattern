package chainofresponsibility;

public class ChiefTeacher extends Responsible {

    private Level responsibleLevel = new Level(4);

    public ChiefTeacher(String responsiblePerson) {
        super(responsiblePerson);
    }

    @Override
    protected boolean beAbleToJudge(Question question) {
        if(question.level.lessThan(responsibleLevel)){
            return true;
        }
        return false;
    }

    @Override
    protected void judge(Question question) {
        System.out.println(this.responsiblePerson + "判断できる");
    }

}
