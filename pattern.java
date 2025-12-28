import java.util.*;

public class pattern {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char a = 'A';
        for(int i=1;i<=n;i++){
           for(int j=i;j<n;j++){
            System.out.print(" ");
           }
            for(int j=1;j<=i;j++){
                System.out.print(a);
                a++;
            }
            System.out.println();
            a='A';
        }
        scan.close();
    }
}