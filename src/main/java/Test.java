import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<String, List<String>> map = Map.ofEntries(
                Map.entry("hello", List.of("world", "george")),
                Map.entry("george", List.of("washington" , "bush", "bush senior"))
        );
        List<String> list = new LinkedList<>();
        list = map.get("george");
        System.out.println(list);

    }
}
