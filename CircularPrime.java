import java.util.*;
public class CircularPrime {
   
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(cirPrime(n)){
            System.out.print(n+" is a circular prime number");
        }
        else{
            System.out.print(n+" is not a circular prime number");
        }
        scan.close();
    }
   
    public static boolean isPrime(int n){
        for(int i = 2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean cirPrime(int n){
        int digits = (int) Math.log10(n)+1;
        int powTen = (int) Math.pow(10,digits-1);
        int temp = n;
        for(int i=0;i<digits;i++){
            if(!isPrime(temp)){
                return false;
            }
            int last = temp%10;
            temp = last*powTen + temp/10;
        }
        return true;
    }
    
}