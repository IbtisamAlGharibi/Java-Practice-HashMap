import java.util.HashMap;
import java.util.Map;

public class EmployeeKeyLoopDemo {

    public static void main(String[] args){

        HashMap<Integer,String> employeeNames = new HashMap<>();
        employeeNames.put(001, "Ibtisam");
        employeeNames.put(002, "Anfal");
        employeeNames.put(003, "Sara");
        employeeNames.put(004, "Maather");
        employeeNames.put(005, "Muna");
        System.out.println(employeeNames);

        for (
                Map.Entry<Integer, String> entry : employeeNames.entrySet()) {
            System.out.println("ID:" + entry.getKey()+" " + "NAMES:" + entry.getValue());
        }


        employeeNames.put(006,"Manar");
        System.out.println("------------------------------------------------");
        for (
                Map.Entry<Integer,String>  entry : employeeNames.entrySet()) {
                System.out.println("ID:" + entry.getKey()+" " + "Names" + entry.getValue());

        }

    }
}
