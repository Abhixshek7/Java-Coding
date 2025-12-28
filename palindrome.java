import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int rev = Palindrome(num);
        if(num==rev){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not palindrome");
        }
        scan.close();
    
    }
    static int Palindrome(int n){
        int rev = 0;
        while(n!=0){
            rev = (rev*10)+(n%10);
            n/=10;
        }
        return rev;
    }
}

 