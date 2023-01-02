import java.util.*;

public class SemantickiAnalizator {


    Token token = new Token();
    public class Token {
        public String name;
        public Integer line;


        public boolean equals(Token obj) {
            return this.name.equals( obj.name );
        }
    }
// <br_retka_koristenja> <br_retka_definicije> <leksicka_jedinka
// err <br_retka> <leksicka_jedinka>

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            arrayList.add(sc.nextLine());
        }

        Map<Integer, Map<Integer, String>> mapValues = new HashMap<>(); // stavi pojavu neke v
        int j = 0;
        for (int i = 0 ; i < arrayList.size(); i++){
            String s = arrayList.get(i);
            if( s.startsWith("KR_AZ") ){
                mapValues.remove(j);
                j--;
            } else if ( s.startsWith("IDN") ){
                String temp = arrayList.get(i-1);
                if (temp.contains("KR_ZA")){ //     IDN 2 y
                    j++;
                    Map<Integer, String> tempMap = new HashMap<>();
                    String[] help = s.split(" ");
                    tempMap.put( Integer.valueOf(help[1]) , help[2]);
                    mapValues.put(j, tempMap);
                }

                if (temp.contains("<naredba_pridruzivanja>")){
                    Map<Integer, String> tempMap = mapValues.get(j);
                    String[] help = s.split(" ");
                    tempMap.put( Integer.valueOf(help[1]) , help[2]);
                    mapValues.put(j, tempMap);
                }
                else {
                    String[] help = s.split(" ");
                    Boolean isIn = false;
                    for (Map.Entry<Integer,Map<Integer, String>> entry : mapValues.entrySet()) {
                            System.out.println("Key = " + entry.getKey() +
                                    ", Value = " + entry.getValue());
                        }


                }


                }
                

        }

    }
}
