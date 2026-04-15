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


    }
}
