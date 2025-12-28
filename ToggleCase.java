import java.util.*;
public class ToggleCase {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        String result = toggleCase(input);
        System.out.print(result);
        scan.close();
    }
    public static String toggleCase(String s){
        StringBuilder result = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isUpperCase(ch)){
                result.append(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch)){
                result.append(Character.toUpperCase(ch));
            }
            else{
                result.append(ch);
            }
        }
        return result.toString();
    }
}