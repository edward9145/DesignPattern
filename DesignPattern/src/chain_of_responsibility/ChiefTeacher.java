package chain_of_responsibility;

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

}
