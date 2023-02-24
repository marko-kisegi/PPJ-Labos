import java.util.*;

public class Tester {
    static Stack<String> stog = new Stack<>();
    private Map<String, List<String>> table = Map.ofEntries(
            Map.entry("<program>", List.of( "<lista_naredbi>" , "IDN" , "KR_ZA",  "⏊")),
            Map.entry("<lista_naredbi>" , List.of( "<naredba>", "<lista_naredbi>" , "IDN", "KR_ZA", "$", "KR_AZ", "⏊")),
            Map.entry("<naredba>",List.of("<naredba_pridruzivanja>", "IDN", "<za_petlja>", "KR_ZA")),
            Map.entry("<naredba_pridruzivanja>",List.of("<IDN OP_PRIDRUZI <E>" , "IDN")),
            Map.entry("<za_petlja>",List.of("KR_ZA")),
            Map.entry("<E>",List.of("IDN", "BROJ", "OP_PLUS", "OP_MINUS", "L_ZAGRADA")),
            Map.entry("<E_lista>",List.of("OP_PLUS", "OP_MINUS", "IDN","KR_ZA","KR_DO", "KR_AZ", "D_ZAGRADA" ,"⏊")),
            Map.entry("<T>",List.of("IDN","BROJ","OP_PLUS","OP_MINUS","L_ZAGRADA")),
            Map.entry("<T_lista>",List.of("OP_PUTA", "OP_DIJELI", "IDN", "KR_ZA",
                    "KR_DO", "KR_AZ", "OP_PLUS", "OP_MINUS", "D_ZAGRADA", "⏊")),
            Map.entry("<P>", List.of("OP_PLUS", "L_ZAGRADA", "IDN", "BROJ"))
    );
    private Map<String, String> map = Map.ofEntries(


            );

    static List<String> list = new ArrayList<>();

    static void rezultati_tablice(String tekstStoga, String tekstKazala){

    }
    static int kazaljka;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            list.add(sc.next());
        }

        kazaljka = 0;
        stog.push("$");
        stog.push("<program>");
        while(true){
            //switch(akcija(stog.pop, list.get(i))):
              //  case pomak:
                //    pomak(i);
        }
    }
}
