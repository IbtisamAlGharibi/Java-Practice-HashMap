import java.util.HashMap;

public class EmployeeEmptyDemo {
    public static void main(String[] args){

        HashMap<Integer,String> employeeNames = new HashMap<>();
        boolean check = employeeNames.isEmpty();
        System.out.println(check);

        employeeNames.put(001, "Ibtisam");
        employeeNames.put(002, "Anfal");
        employeeNames.put(003, "Sara");
        employeeNames.put(004, "Maather");
        employeeNames.put(005, "Muna");
        System.out.println(employeeNames);

        boolean check2 = employeeNames.isEmpty();
        System.out.println(check2);

        employeeNames.clear();
        System.out.println(employeeNames);
        boolean check3 = employeeNames.isEmpty();
        System.out.println(check3);





    }
}
