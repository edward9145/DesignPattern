package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observerList = new ArrayList<Observer>();

    public void addObserver(Observer observer){
        this.observerList.add(observer);
    }

    public void notifyObservers(){
        for(Observer observer : observerList){
            observer.update();
        }
    }

    public int run(int count){
        this.notifyObservers();
        return count;
    }

}
