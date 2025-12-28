import java.util.*;
public class palindromewords {
    public static boolean isPalindrome(String s){
        String result = new StringBuilder(s).reverse().toString();
        return s.equals(result);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        if(isPalindrome(input)){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not palindrome");
        }
        scan.close();
       
    }
    
}
