import java.lang.reflect.Array;
import java.util.*;

public class Semanticka {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            arrayList.add(sc.nextLine());
        }
        Map<Integer, Map<String, Integer>> map = new TreeMap<>();
        int j = 0;
        map.put(j, new TreeMap<>());
        for ( int i = 0 ; i < arrayList.size() ; i++){
            String line = arrayList.get(i).strip();
            if (line.startsWith("KR_AZ")){
                map.remove(j);
                j--;
            }

            else if (line.startsWith("IDN")){
                String string = arrayList.get(i-1).strip();
                //      IDN 5 i
                String[] strings = line.split(" ");
                Map<String, Integer> tempMap = new TreeMap<>();
                if(string.split(" ").equals("KR_ZA")){
                    tempMap.put(strings[2], Integer.valueOf(strings[1]));
                    j++;
                    map.put(j, tempMap);
                }
                else if (string.equals("<naredba_pridruzivanja>")){
                    boolean keyFound = false;
                    // pogledaj jel kljuc unutra vec
                    Map<String, Integer> helpMap = new TreeMap<>();
                    tempMap.put(strings[2], Integer.valueOf(strings[1]));
                    System.out.println(strings[2]);
                    for (Map<String, Integer> map1 : map.values()){
                        if(map1.containsKey(strings[2])){
                            keyFound = true;
                        }
                    }
                    // ako kljuc nije naden onda stavi
                    if (!keyFound){
                        Map<String, Integer> map2 = map.get(j);
                        map2.put(strings[2], Integer.valueOf(strings[1]));
                        map.put(j, map2);

                    }
                }
                else {
                    boolean isUsed = false;

                    System.out.println(strings[1]);

                    Map<String, Integer> helpMap = new TreeMap<>();
                    for (Map<String, Integer> map1 : map.values()){
                        System.out.println(map1);
                        if(map1.containsKey(strings[2])){
                            isUsed = true;
                            helpMap = map1;
                        }
                    }
                    if (isUsed) {
                        System.out.println(strings[1] + " " + helpMap.get(strings[2]) + " " + strings[2]);
                    }
                    else {
                        System.out.println("err " + strings[1] + " " + strings[2]);
                        return;
                    }
                }
            }
        }
    }
}
