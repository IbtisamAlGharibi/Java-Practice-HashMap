import java.util.HashMap;
import java.util.Map;

public class EmployeeCompareUpdateDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> employeeNames = new HashMap<>();
        employeeNames.put(001, "Ibtisam");
        employeeNames.put(002, "Anfal");
        employeeNames.put(003, "Sara");
        employeeNames.put(004, "Maather");
        employeeNames.put(005, "Muna");

        System.out.println(employeeNames);

        String first = employeeNames.get(001);
        System.out.println(first);

        employeeNames.put(002,"Manar");

        String second = employeeNames.get(002);
        System.out.println(second);

        System.out.println(employeeNames);

}}
