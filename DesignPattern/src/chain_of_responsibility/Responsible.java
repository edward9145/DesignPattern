package chainofresponsibility;

public abstract class Responsible {

    private Responsible next;
    protected String responsiblePerson = null;

    public Responsible(String responsiblePerson){
        this.responsiblePerson = responsiblePerson;
    }

    public Responsible setNext(Responsible next){
        this.next = next;
        return next;
    }

    public final void putQuestion(Question question){
        if(beAbleToJudge(question)){
            judge(question);
        }else if(next != null){
            next.putQuestion(question);
        }else{
            System.out.println("誰にも判断できませんでした。やってみなさい。");
        }
    }

    protected abstract boolean beAbleToJudge(Question question);
    protected void judge(Question question){
        System.out.println(question.name + " ー＞ " + this.responsiblePerson + "判断する");
    }

}
