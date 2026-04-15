import java.util.HashMap;

public class DepartmentManagerDemo {

    public static void main (String[] args){

        HashMap<String,String> deptName = new HashMap<>();
        deptName.put("IT", "Amal");
        deptName.put("BS","Muna");
        deptName.put("DM", "Nora");
        deptName.put("EN", "Manar");
        deptName.put("SW", "Rahaf");
        System.out.println(deptName);

        String find = deptName.get("IT");
        System.out.println(find);

        boolean check = deptName.containsKey("DM");
        System.out.println(check);


        deptName.put("EN", "Anfal");
        System.out.println(deptName);

        deptName.remove("SW");
        System.out.println(deptName);

}}
