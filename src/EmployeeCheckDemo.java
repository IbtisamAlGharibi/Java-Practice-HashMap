import java.util.HashMap;
import java.util.Map;

public class EmployeeCheckDemo {
    public static void main(String[] args){
        HashMap<Integer,String> employeeNames = new HashMap<>();
        employeeNames.put(001,"Ibtisam");
        employeeNames.put(002,"Anfal");
        employeeNames.put(003,"Sara");
        employeeNames.put(004,"Maather");
        employeeNames.put(005, "Muna");

        for (Map.Entry<Integer,String> entry : employeeNames.entrySet());

        System.out.println(employeeNames.containsKey(001));

        System.out.println(employeeNames.containsKey(002));

        System.out.println(employeeNames.containsValue("Sara"));
        System.out.println(employeeNames.containsValue("Muna"));
    }
}
