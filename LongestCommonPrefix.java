import java.util.*;
public class LongestCommonPrefix {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of words = ");
        int n = scan.nextInt();
        scan.nextLine();
        String[] words = new String[n];
        for(int i=0;i<n;i++){
            words[i]= scan.next();
        }
        String result = longestCommonPrefix(words);
        System.out.print(result);
        scan.close();
    }
    public static String longestCommonPrefix(String[] s){
        if(s.length==0){
            return " ";
        }
        StringBuilder result = new StringBuilder();
        Arrays.sort(s);
        char[] first = s[0].toCharArray();
        char[] last = s[s.length-1].toCharArray();
        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
             result.append(first[i]);
        }
        return result.length()>0?result.toString():" ";
    }

}