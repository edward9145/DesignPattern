package iterator;

public class MyStudentListIterator implements Iterator {

    private MyStudentList myStudentList;
    private int index;

    public MyStudentListIterator(MyStudentList list){
        this.myStudentList = list;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(myStudentList == null) {
            return false;
        }
        return myStudentList.getLastNum() > index;
    }

    @Override
    public Object next() {
        Student student = myStudentList.getStudentAt(index);
        index ++;
        return student;
    }

}
