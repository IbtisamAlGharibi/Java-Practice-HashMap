import java.util.HashMap;

public class CourseTrainerDemo {

    public static void main (String[] args){

        HashMap<String,String> courseName = new HashMap<>();
        courseName.put("IT", "Ibtisam");
        courseName.put("NW","Muna");
        courseName.put("SW", "Nora");
        courseName.put("HR", "Sara");
        courseName.put("DM", "Anfal");
        System.out.println(courseName);

        String find = courseName.get("IT");
        System.out.println(find);

        boolean check = courseName.containsKey("SW");
        System.out.println(check);


        courseName.put("HR", "Nora");
        System.out.println(courseName);

        courseName.remove("NW");
        System.out.println(courseName);





    }
}
