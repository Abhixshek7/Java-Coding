import java.util.*;
public class swapAdjacent {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        StringBuilder result = new StringBuilder(input);
        for(int i=0;i<result.length()-1;i+=1){
            char temp = result.charAt(i);
            result.setCharAt(i,result.charAt(i+1));
            result.setCharAt(i+1,temp);
        }
        System.out.print(result);
        scan.close();
    }
}