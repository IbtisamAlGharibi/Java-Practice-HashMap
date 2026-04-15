import java.util.HashMap;

public class MovieDirectorDemo {

    public static void main(String[] args){

        HashMap<String, String> movieNames = new HashMap<>();
        movieNames.put("Harry Potter", "Harry");
        movieNames.put("The Secret Garden","Jone");
        movieNames.put("Matilda", "Marry");
        movieNames.put("The giver", "Jerry");
        movieNames.put("The Golden Rose", "Rosaline");
        System.out.println(movieNames);

        String find = movieNames.get("Matilda");
        System.out.println(find);

        boolean check = movieNames.containsKey("Harry Potter");
        System.out.println(check);

        movieNames.put("The giver", "Jimi");
        System.out.println(movieNames);

        movieNames.remove("The giver");
        System.out.println(check);

    }
}
