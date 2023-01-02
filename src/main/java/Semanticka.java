import java.lang.reflect.Array;
import java.util.*;

public class Semanticka {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            arrayList.add(sc.nextLine());
        }
        Map<Integer, Map<Integer, List<String>>> map = new HashMap<>();
        int j = 0;
        map.put(j, new HashMap<>());
        for ( int i = 0 ; i < arrayList.size() ; i++){
            String line = arrayList.get(i).strip();
            if (line.startsWith("KR_AZ")){
                map.remove(j);
                j--;
            }

            else if (line.startsWith("IDN")){
                String string = arrayList.get(i-1).strip();
                //        IDN 5 i
                String[] strings = string.split(" ");
                Map<Integer, List<String>> map2 = new HashMap<>();
                List<String> list = new ArrayList<>();
                list.add(strings[2]);
                map2.put(Integer.valueOf(strings[1]), list);
                if(string.equals("KR_ZA")){
                    j++;
                    map.put(j, map2);
                }
                else if (string.equals("<naredba_pridruzivanja>")){

                }
            }
        }
    }
}
