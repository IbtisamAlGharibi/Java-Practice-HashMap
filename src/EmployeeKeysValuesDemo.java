import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeKeysValuesDemo {

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

        Set<Integer> EID = employeeNames.keySet();
        System.out.println("Employees ID" + EID);

        Collection<String> names = employeeNames.values();
        System.out.println("Employees names:"+ names);

        employeeNames.put(006, "Nora");

        Set<Integer> EID2 = employeeNames.keySet();
        System.out.println("Employees ID" + EID2);
    }
}
