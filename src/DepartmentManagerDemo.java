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
}
