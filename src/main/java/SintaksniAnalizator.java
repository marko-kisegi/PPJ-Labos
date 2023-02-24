import java.util.*;

/*
<program> ::= <lista_naredbi>
<lista_naredbi> ::= <naredba> <lista_naredbi>
<lista_naredbi> ::= $
<naredba> ::= <naredba_pridruzivanja>
<naredba> ::= <za_petlja>
<naredba_pridruzivanja> ::= IDN OP_PRIDRUZI <E>
<za_petlja> ::= KR_ZA IDN KR_OD <E> KR_DO <E> <lista_naredbi> KR_AZ
<E> ::= <T> <E_lista>
<E_lista> ::= OP_PLUS <E>
<E_lista> ::= OP_MINUS <E>
<E_lista> ::= $
<T> ::= <P> <T_lista>
<T_lista> ::= OP_PUTA <T>
<T_lista> ::= OP_DIJELI <T>
<T_lista> ::= $
<P> ::= OP_PLUS <P>
<P> ::= OP_MINUS <P>
<P> ::= L_ZAGRADA <E> D_ZAGRADA
<P> ::= IDN
<P> ::= BROJ

<program> ::= <lista_naredbi> = {IDN KR_ZA ⏊}
<lista_naredbi> ::= <naredba> <lista_naredbi> = {IDN KR_ZA}
<lista_naredbi> ::= $ = {KR_AZ ⏊}
<naredba> ::= <naredba_pridruzivanja> = {IDN}
<naredba> ::= <za_petlja> = {KR_ZA}
<naredba_pridruzivanja> ::= IDN OP_PRIDRUZI <E> = {IDN}
<za_petlja> ::= KR_ZA IDN KR_OD <E> KR_DO <E> <lista_naredbi> KR_AZ = {KR_ZA}
<E> ::= <T> <E_lista> = {IDN BROJ OP_PLUS OP_MINUS L_ZAGRADA}
<E_lista> ::= OP_PLUS <E> = {OP_PLUS}
<E_lista> ::= OP_MINUS <E> = {OP_MINUS}
<E_lista> ::= $ = {IDN KR_ZA KR_DO KR_AZ D_ZAGRADA ⏊}
<T> ::= <P> <T_lista> = {IDN BROJ OP_PLUS OP_MINUS L_ZAGRADA}
<T_lista> ::= OP_PUTA <T> = {OP_PUTA}
<T_lista> ::= OP_DIJELI <T> = {OP_DIJELI}
<T_lista> ::= $ = {IDN KR_ZA KR_DO KR_AZ OP_PLUS OP_MINUS D_ZAGRADA ⏊}
<P> ::= OP_PLUS <P> = {OP_PLUS}
<P> ::= OP_MINUS <P> = {OP_MINUS}
<P> ::= L_ZAGRADA <E> D_ZAGRADA = {L_ZAGRADA}
<P> ::= IDN = {IDN}
<P> ::= BROJ = {BROJ}
 */
public class SintaksniAnalizator {
    static List<String> nizLeksickihJedinki = new LinkedList<>();

    static List<String> uniformniZnakovi = List.of("IDN", "KR_OD", "KR_DO", "D_ZAGRADA", "OP_PRIDRUZI", "KR_AZ");
    static Map<String, List<String>> gramatika = Map.ofEntries(
            Map.entry("<program>", List.of( "<lista_naredbi>" , "IDN" , "KR_ZA",  "⏊")),
            Map.entry("<lista_naredbi>" , List.of( "<naredba>", "<lista_naredbi>" , "IDN", "KR_ZA", "$", "KR_AZ", "⏊")),
            Map.entry("<naredba>",List.of("<naredba_pridruzivanja>", "IDN", "<za_petlja>", "KR_ZA")),
            Map.entry("<naredba_pridruzivanja>",List.of("<IDN OP_PRIDRUZI <E>" , "IDN")),
            Map.entry("<za_petlja>",List.of("KR_ZA")),
            Map.entry("<E>",List.of("IDN", "BROJ", "OP_PLUS", "OP_MINUS", "L_ZAGRADA")),
            Map.entry("<E_lista>",List.of("OP_PLUS", "OP_MINUS", "IDN","KR_ZA","KR_DO", "KR_AZ", "D_ZAGRADA" ,"⏊")),
            Map.entry("<T>",List.of("IDN","BROJ","OP_PLUS","OP_MINUS","L_ZAGRADA")),
            Map.entry("<T_lista>",List.of("OP_PUTA", "OP_DIJELI", "IDN", "KR_ZA", "KR_DO", "KR_AZ",
                    "OP_PLUS", "OP_MINUS", "D_ZAGRADA", "⏊")),
            Map.entry("<P>", List.of("OP_PLUS", "L_ZAGRADA", "IDN", "BROJ"))


    );
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            nizLeksickihJedinki.add(sc.nextLine());
        };

        Stack stack = new Stack<String>();
        stack.push("<program>");
        System.out.println(nizLeksickihJedinki);
    }
}
