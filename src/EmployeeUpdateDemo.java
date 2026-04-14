import java.util.HashMap;
import java.util.Map;

public class EmployeeUpdateDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> employeeNames = new HashMap<>();
        employeeNames.put(001, "Ibtisam");
        employeeNames.put(002, "Anfal");
        employeeNames.put(003, "Sara");
        employeeNames.put(004, "Maather");
        employeeNames.put(005, "Muna");


        for (
                Map.Entry<Integer, String> entry : employeeNames.entrySet()) {
            System.out.println(entry);
        }

        employeeNames.put(005,"Nora");

        System.out.println(employeeNames.get(005));
        employeeNames.put(004,"Rahaf");
        for (
                Map.Entry<Integer, String> entry : employeeNames.entrySet()) {
            System.out.println(entry);
        }


    }
}