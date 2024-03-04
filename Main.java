import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(4, "aab", "aab", "aab");
        Student student2 = new Student(2, "aaa", "aaa", "aaa");
        Student student3 = new Student(3, "Aaa", "Aaa", "Aaa");
        Student student4 = new Student(1, "bbb", "bbb", "bbb");
        Student student5 = new Student(5, "fbb", "fbb", "gbb");
        Student student6 = new Student(6, "fgb", "fgb", "ggb");
        List<Student> studentList1 = new ArrayList<>();
        List<Student> studentList2 = new ArrayList<>();
        List<Student> studentList3 = new ArrayList<>();

        StudentGroup studentGroup1 = new StudentGroup(studentList1);
        StudentGroup studentGroup2 = new StudentGroup(studentList2);
        StudentGroup studentGroup3 = new StudentGroup(studentList3);
        



        studentGroup1.addStudent(student1);
        studentGroup1.addStudent(student2);
        studentGroup1.addStudent(student3);
        studentGroup2.addStudent(student4);
        studentGroup2.addStudent(student5);
        studentGroup2.addStudent(student5);
        studentGroup3.addStudent(student6);
        
        
        
        StudentGroupService service = new StudentGroupService(studentGroup1);
        for (Student student : studentGroup1) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroup()) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroupByFIO()) {
            System.out.println(student);
        }
        
        List<StudentGroup> streamList1 = new ArrayList<>();
        List<StudentGroup> streamList2 = new ArrayList<>();
        
        streamList1.add(studentGroup1);
        streamList1.add(studentGroup2);
        streamList2.add(studentGroup3);
        
        Stream stream1 = new Stream(streamList1);
        
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        Stream stream2 = new Stream(streamList2);
        streams.add(stream2);
        
        
        
        
        Controller ctrl  = new Controller();
        for (Stream stream : streams) {
            ctrl.addStream(stream);
        }
        
        ctrl.sortStream();

        for (Stream stream : streams) {
            System.out.println(stream);            
        }
        
        
        


//        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
//        while (iterator.hasNext())
//            System.out.println(iterator.next());
//        System.out.println();
//        for(Student student : studentGroup){
//            System.out.println(student);
    }
}