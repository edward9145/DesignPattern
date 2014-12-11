package mediator;

public class Reina implements Colleague {

    private String name = "玲奈";
    private int tension;
    private Colleague secretLover = null;
    private LoveMediator mediator = new Saito();

    @Override
    public String getName() {
        return this.name;
    }

    public  void setSecretLover(Colleague colleague){
        this.secretLover = colleague;
    }

    public void needsAdvice(){
        this.tension = mediator.consultation(this,secretLover);
    }

}
