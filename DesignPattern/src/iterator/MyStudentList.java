package iterator;

public class MyStudentList extends StudentList implements Aggregate {

    public MyStudentList(){

    }

    public MyStudentList(int count){
        super(count);
    }

    @Override
    public Iterator iterator() {
        // TODO 自動生成されたメソッド・スタブ
        return new MyStudentListIterator(this);
    }

}
