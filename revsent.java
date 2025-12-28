import java.util.*;
public class revsent {

    private static String reversesent(String s){
        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i= words.length-1;i>=0;i--){
            result.append(words[i]).append(" ");
        }
        return result.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String result = reversesent(input);
        System.out.print(result);
        scan.close();
    }
}