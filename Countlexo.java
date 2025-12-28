import java.util.*;
public class Countlexo {
    public static String lexo(String s){
        Map<Character,Integer> freq = new TreeMap<>();
        char[] arr = s.toCharArray();
        for(char ch:arr){
            freq.put(ch,freq.getOrDefault(ch, 0)+1);
        }
        StringBuilder result = new StringBuilder();
        for(Map.Entry<Character,Integer>entry:freq.entrySet()){
            result.append(entry.getKey()+""+entry.getValue());
        }
        return result.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        System.out.print(lexo(input));
        scan.close();
    }
}
