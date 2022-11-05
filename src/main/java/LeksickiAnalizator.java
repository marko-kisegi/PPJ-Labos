import java.util.*;

/* Marko Kisegi

 */
public class LeksickiAnalizator {
    public static void main(String[] args) {
        Map<String, String> keywords =  Map.ofEntries(
                Map.entry("idn", "IDN"),
                Map.entry("const", "BROJ"),
                Map.entry("=" , "OP_PRIDRUZI" ),
                Map.entry("+" , "OP_PLUS" ),
                Map.entry("-" , "OP_MINUS" ),
                Map.entry("*" , "OP_PUTA" ),
                Map.entry("/" , "OP_DIJELI" ),
                Map.entry("(" , "L_ZAGRADA" ),
                Map.entry(")" , "D_ZAGRADA" ),
                Map.entry("za" , "KR_ZA"),
                Map.entry("od" , "KR_OD" ),
                Map.entry("do" , "KR_DO" ),
                Map.entry("az" , "KR_AZ")
        );
        Map<String, String> operators = Map.ofEntries(
                Map.entry("=" , "OP_PRIDRUZI" ),
                Map.entry("+" , "OP_PLUS" ),
                Map.entry("-" , "OP_MINUS" ),
                Map.entry("*" , "OP_PUTA" ),
                Map.entry("/" , "OP_DIJELI" ),
                Map.entry("(" , "L_ZAGRADA" ),
                Map.entry(")" , "D_ZAGRADA" )
        );
        Scanner sc = new Scanner(System.in);
        List<String> inputLines = new LinkedList<>();
        while(sc.hasNextLine()) {
            inputLines.add(sc.nextLine());
        };
        for(int i = 0 ;  i < inputLines.size(); i++){
            String s = inputLines.get(i);
            if(s.contains("//")){
                s = s.substring(0, s.indexOf("//"));
            }
            int j = 0;
            String keyword = "";

            while(j < s.length()){

                int phraseLength = 0;
                boolean isNumber = Character.isDigit(s.charAt(j));
                boolean isWord = Character.isLetter(s.charAt(j));
                if( isWord ){
                    while (j < s.length() && !operators.containsKey(String.valueOf(s.charAt(j))) &&
                            !String.valueOf(s.charAt(j)).equals(" "))
                    {
                        j++;
                        phraseLength++;

                    }
                }
                else if(isNumber){
                    while ( j< s.length() && Character.isDigit(s.charAt(j))&&
                            !String.valueOf(s.charAt(j)).equals(" ")){
                        j++;
                        phraseLength++;
                    }
                }
                String phraseSubstring = s.substring(j - phraseLength,j).trim();
                if (keywords.containsKey(phraseSubstring)){
                    keyword = keywords.get(phraseSubstring);
                    System.out.println(keyword + " " + (i + 1) + " " + phraseSubstring);
                } else if (isNumber) {
                    keyword = keywords.get("const");
                    System.out.println(keyword + " " + (i + 1) + " " + phraseSubstring);
                } else if (isWord){
                    keyword = keywords.get("idn");
                    System.out.println(keyword + " " + (i + 1) + " " + phraseSubstring);
                } else if(keywords.containsKey(String.valueOf(s.charAt(j)))){
                    keyword = keywords.get(String.valueOf(s.charAt(j)));
                    System.out.println(keyword + " " + (i + 1) + " " + String.valueOf(s.charAt(j)));
                    j++;
                }
                else j++;
            }
        }
    }
}