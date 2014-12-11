package mediator;

import java.util.HashMap;
import java.util.Map;

public class Saito implements LoveMediator {

    private Map<String, Colleague> colleagueMap = new HashMap<String,Colleague>();

    public void addColleague(Colleague colleague){
        colleagueMap.put(colleague.getName(), colleague);
    }

    @Override
    public int consultation(Colleague colleagueInLove, Colleague secretLover) {
        int possibility= 0;
        /* さまざまな状況を考慮して、possibility を導出 */

        return possibility;
    }



}
