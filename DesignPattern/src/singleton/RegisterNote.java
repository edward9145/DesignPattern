package singleton;

public class RegisterNote {

    private RegisterNote note = new RegisterNote();

    private RegisterNote(){}

    public RegisterNote getInstance(){
        returh this.note;
    }

}
