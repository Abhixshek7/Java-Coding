import java.util.*;
public class printSubstring {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        for(int i=1;i<=word.length();i++){
            System.out.println(word.substring(0, i));
        }
        scan.close();
    }
}
