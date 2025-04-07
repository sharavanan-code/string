import java.util.LinkedHashMap;
public class CharCount {
    public static void main(String[] args) {
        String str = "hello";
        LinkedHashMap<Character,Integer> charCountMap = new LinkedHashMap<>();

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            if(charCountMap.containsKey(ch)){
                charCountMap.put(ch, charCountMap.get(ch)+1);
            }
            else{
                charCountMap.put(ch,1);
            }
        }

        for(char ch:charCountMap.keySet()){
            System.out.println(ch+":"+charCountMap.get(ch));

        }
        
    }
    
}
