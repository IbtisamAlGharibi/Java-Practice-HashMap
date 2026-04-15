import java.util.HashMap;

public class CountryCapitalDemo {

    public static void main(String[] args){

        HashMap<String ,String > countryNames = new HashMap<>();
        countryNames.put("Oman", "Muscat");
        countryNames.put("Eygpt","Cairo");
        countryNames.put("Lebanon", "Beirut");
        countryNames.put("Qatar", "Doha");
        countryNames.put("UAE", "Dubai");
        System.out.println(countryNames);

        String first = countryNames.get("Oman");
        System.out.println(first);

        boolean check = countryNames.containsKey("Qatar");
        System.out.println(check);

        countryNames.put("Oman", "Nizwa");
        System.out.println(countryNames);




    }
}
