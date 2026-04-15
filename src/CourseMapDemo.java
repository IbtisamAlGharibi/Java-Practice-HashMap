import java.util.HashMap;

public class CourseMapDemo {

    public static void main (String[] args){

        HashMap<String,String> courseName = new HashMap<>();
        courseName.put("ab001", "Java");
        courseName.put("ab002","python");
        courseName.put("ab003", "Database");
        courseName.put("ab004", "NW");
        courseName.put("ab005", "C++");
        System.out.println(courseName);

        String find = courseName.get("ab001");
        System.out.println(find);

        boolean check = courseName.containsKey("ab003");
        System.out.println(check);


        courseName.put("ab002", "Security");
        System.out.println(courseName);

        courseName.remove("ab004");
        System.out.println(courseName);
}}

