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

    }
}
