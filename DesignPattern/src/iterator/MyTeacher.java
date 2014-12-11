package iterator;

public class MyTeacher extends Teacher {

    private MyStudentList list;

    @Override
    public void createStudentList() {
        this.list = new MyStudentList(5);
        list.add(new Student("赤井亮太",1));
        list.add(new Student("赤羽里美",2));
        list.add(new Student("岡田美央",2));
        list.add(new Student("西森俊介",1));
        list.add(new Student("中ノ森玲菜",2));
    }

    @Override
    public void callStudents() {


    }

//    @Override
//    public void callStudents() {
//        int size = studentList.getLastNum();
//        for(int n=0;n<size;n++){
//            Student student = studentList.getStudentAt(n);
//            System.out.println(student.getName() + student.getSex());
//        }
//    }

}
