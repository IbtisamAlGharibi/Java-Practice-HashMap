import java.util.HashMap;

public class BookAuthorDemo {
    public static void main(String [] args){

        HashMap<String, String> books = new HashMap<>();
        books.put("Harry Potter", "Harry");
        books.put("The Secret Garden","Jone");
        books.put("Matilda", "Marry");
        books.put("The giver", "Jerry");
        books.put("The Golden Rose", "Rosaline");
        System.out.println(books);

        String find = books.get("Matilda");
        System.out.println(find);

        boolean check = books.containsKey("Harry Potter");
        System.out.println(check);

        books.put("The giver", "Jimi");
        System.out.println(books);

        books.remove("The giver");
        System.out.println(check);





    }
}
