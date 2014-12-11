package observer;

public class Student extends Subject {

    String name;
    public Student(String name){
        this.name = name;
    }
    @Override
    public int run(int count) {
        this.notifyObservers();
        return count;
    }

}
