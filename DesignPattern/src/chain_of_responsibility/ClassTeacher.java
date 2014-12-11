package chain_of_responsibility;

public class ClassTeacher extends Responsible {

    private Level responsibleLevel = new Level(2);

    public ClassTeacher(String responsiblePerson) {
        super(responsiblePerson);
    }

    @Override
    protected boolean beAbleToJudge(Question question) {
        if(question.level.lessThan(responsibleLevel)){
            return true;
        }
        return false;
    }

}
