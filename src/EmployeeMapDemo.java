import java.util.HashMap;

public class EmployeeMapDemo {

    public static void main(String[] args){
        HashMap<Integer,String> employeeNames = new HashMap<>();
        employeeNames.put(001,"Ibtisam");
        employeeNames.put(002,"Anfal");
        employeeNames.put(003,"Sara");
        employeeNames.put(004,"Maather");
        employeeNames.put(005, "Muna");
        System.out.println(employeeNames);

        String find = employeeNames.get(001);
        System.out.println(find);

        boolean check = employeeNames.containsKey(003);
        System.out.println(check);

        employeeNames.put(002, "Nora");
        System.out.println(employeeNames);

        employeeNames.remove(005);
        System.out.println(check);


}}


