import java.util.HashMap;

public class StudentMarksDemo {

    public static void main(String[] args){

        HashMap<Integer,Integer> studentMarks = new HashMap<>();
        studentMarks.put(001, 99);
        studentMarks.put(002, 95);
        studentMarks.put(003, 80);
        studentMarks.put(004, 85);
        studentMarks.put(005, 90);
        System.out.println(studentMarks);

        int first = studentMarks.get(001);
        boolean find = studentMarks.containsKey(003);
        System.out.println(find);





    }
}
