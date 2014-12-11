package iterator;

public class MyStudentList extends StudentList implements Aggregate {

    public MyStudentList(){

    }

    public MyStudentList(int count){
        super(count);
    }

    @Override
    public Iterator iterator() {
        return new MyStudentListIterator(this);
    }

}
