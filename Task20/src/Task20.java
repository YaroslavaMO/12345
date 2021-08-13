import java.util.HashMap;
import java.util.Map;

public class Task20 {
    public static void main(String[] args) {
        Map <String,String> Autor = new HashMap<String,String>();
        Autor.put("key","Tolstoy");
        Autor.put("key1","Chehov");
        Autor.put("key2","Pushkin");

        String key = Autor.get("key1");
        System.out.println(key);
    }
}
