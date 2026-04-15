import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeIterateDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> employeeNames = new HashMap<>();
        employeeNames.put(001, "Ibtisam");
        employeeNames.put(002, "Anfal");
        employeeNames.put(003, "Sara");
        employeeNames.put(004, "Maather");
        employeeNames.put(005, "Muna");


        for (
                Map.Entry<Integer, String> entry : employeeNames.entrySet()) {
            System.out.println("ID:" + entry.getKey()+" " + "NAMES:" + entry.getValue());
        }

        employeeNames.put(006, "Nora");
        System.out.println("---------------------------------------------------------");

        for (
                Map.Entry<Integer, String> entry : employeeNames.entrySet()) {
            System.out.println("ID:" + entry.getKey()+" " + "NAMES:" + entry.getValue());
        }


    }}

