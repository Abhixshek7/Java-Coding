import java.util.*;

public class prodofconsecutive {

    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = scan.nextInt();
        boolean condition = false;
        for(int i=1;i*(i+1)<=n;i++){
            if(i*(i+1)==n){
                System.out.print(i + " " + (i+1));
                condition = true;
                break;
            }
        }
        if(!condition){
            System.out.print(n + " has no consecutive products");
        }
        scan.close();
    }
}