import java.util.*;

public class Sanalizator2 {
    static int i;
    static String ulaz ;
    static List<String> ulazniNiz = new ArrayList<>();
    static Stack<String> stack = new Stack<>();

    static List<String> tree = new LinkedList<>();
    private static void c() {


        ulaz = ulazniNiz.get(i+1);
    }
    private static void s1(){
        s();
        s2();
    }
    private static void s2(){
    }
    private static void s(){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            ulazniNiz.add(sc.nextLine());
        };
        i = 0;
        ulaz = ulazniNiz.get(i);
        c();
        if(ulaz != "⏊"){
            tree.add(ulaz);
        }
        else{
            tree.add(ulaz);
        }
    }


}
