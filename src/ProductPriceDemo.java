import java.util.HashMap;

public class ProductPriceDemo {

    public static void main(String[] args){
        HashMap<String,Double>  productNames = new HashMap<String, Double>();
        productNames.put("prod1", 3.5);
        productNames.put("prod2",4.2);
        productNames.put("prod3", 5.5);
        productNames.put("prod4", 2.5);
        productNames.put("prod5", 6.4);

        System.out.println(productNames);
        Double first = productNames.get("prod2");
        System.out.println(first);

        boolean check = productNames.containsKey("prod4");
        System.out.println(check);

        productNames.put("prod5", 4.4);
        System.out.println(productNames);

        productNames.remove("prod3");
        System.out.println(productNames);
        System.out.println(productNames.size());




    }
}
