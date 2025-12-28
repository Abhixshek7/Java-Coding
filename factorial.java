// Factorial using dp
 import java.util.*;
public class factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i=1;i<=n;i++){
            dp[i] = i*dp[i-1];
        }
        System.out.println(dp[n]);
        scan.close();
    }
}



//Factorial using recursion
// import java.util.*;
// public class factorial {

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter the factorial number = ");
//         int n = scan.nextInt();
//         int result = factRec(n);
//         System.out.println(result);
//     }
//     static int factRec(int n){
//         if(n==0|| n==1){
//             return 1;
//         }
//         else{
//             return n*factRec(n-1);
//         }
//     }
// }