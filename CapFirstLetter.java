import java.util.*;

public class CapFirstLetter {

    public static String CaptalizeFirstLetter(String s){
        String [] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word:words){
            if(!word.isEmpty()){
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        return result.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String output = CaptalizeFirstLetter(input);
        System.out.print(output);
        scan.close();
    }
}