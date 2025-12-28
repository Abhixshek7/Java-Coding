// Fibonacci using dynamic programming

import java.util.*;
public class fib {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
        scan.close();
    }
}


// Fibonacci series using recursion
// import java.util.*;
// public class fib {

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter the range if the fibonacci series");
//         int n = scan.nextInt();
//         for(int i=0;i<n;i++){
//             System.out.print(fibrec(i));
//             if(i<n-1){
//                 System.out.print("->");
//             }
//         }

//     }

//     public static int fibrec(int n){
//         if(n==0){
//             return 0;
//         }
//         else if(n==1){
//             return 1;
//         }
//         else{
//             return fibrec(n-1)+fibrec(n-2);
//         }
//     }
// }


// Fibonacci series using loops
// import java.util.*;
// public class fib {

//     public static void fib(int n){
//         int a = 0;
//         int b = 1;
//         for(int i = 1;i<=n;i++){
//             System.out.print(a+" ");
//             int c = a+b;
//             a=b;
//             b=c;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter the range of the fibonacci series = ");
//         int n = scan.nextInt();
//         fib(n);
//         scan.close();
//     }
// }

