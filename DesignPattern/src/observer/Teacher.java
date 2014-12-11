package observer;

public class Teacher implements Observer {

    String name;
    public Teacher(String name){
        this.name = name;
    }

    @Override
    public void update() {
       System.out.println(this.name + " : 更新情報を取りました。");
    }

}
