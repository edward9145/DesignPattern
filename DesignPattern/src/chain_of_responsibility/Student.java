package chain_of_responsibility;

public class Student extends Responsible {

    private Level responsibleLevel = new Level(1);

    public Student(String responsiblePerson) {
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
