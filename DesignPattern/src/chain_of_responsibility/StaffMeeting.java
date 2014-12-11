package chain_of_responsibility;

public class StaffMeeting extends Responsible {

    private Level responsibleLevel = new Level(3);

    public StaffMeeting(String responsiblePerson) {
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
