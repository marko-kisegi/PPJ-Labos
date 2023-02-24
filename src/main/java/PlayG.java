import java.util.*;

public class PlayG {

    public static void main(String[] args) {
        // Map<Integer, ArrayList<String>> map = new HashMap<>();
        /* String s = "KR_ZA 5 za";
        String s2 = "          <naredba_pridruzivanja>";
        Map<Integer, Map<Integer, List<String>>> map1 = new HashMap<>();

        System.out.println(s.contains("KR_ZA"));
        System.out.println(s2.contains("<naredba_pridruzivanja>"));
        System.out.println(s.contains("<naredba_pridruzivanja>"));
        String string = "IDN 5 i ";
        String[] strings = string.split(" ");
        Map<Integer, List<String>> map2 = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add(strings[2]);
        map2.put(Integer.valueOf(strings[1]), list);
        map2.get(5).add("3");
        List<String> seloVeselo = new ArrayList<>();
        seloVeselo.add("selo vesleo");
        seloVeselo.add("njonja");
        map2.put(15, seloVeselo);
        System.out.println(map2);
        map1.put(3, map2);

        for (Map<Integer, List<String>> maps : map1.values()) {
            System.out.println(maps.containsValue("3"));
            for (List<String> lists : maps.values()){
                System.out.println(lists);
            }
        }

         */
        String string = "IDN 5 i";

        Map<Integer, Map<String, Integer>> map = new TreeMap<>();
        Map<String, Integer> map2 = new TreeMap<>();
        map2.put("x", 1);
        map2.put("y", 2);
        map2.put("z", 3);

        map.put(0, map2);
        System.out.println(map);
        System.out.println(map2);
    }
}