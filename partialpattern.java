import java.util.*;
public class partialpattern {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
      
        int cmplt =0;
        int a=1;
        for(int i= 1;i<=n;i++){
            boolean complete = true;
            for(int j =1;j<=i;j++){
                if(a>n){
                    complete = false;
                    break;
                }
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        
        if(complete){
            cmplt++;
        }
        else{
            break;
        }
    }
    System.out.println("Completed rows = "+cmplt);
        scan.close();
    }
}
