import java.util.*;
public class greatest {
    public static void main(String[] args){
        Scanner comparision = new Scanner(System.in);
        int a = comparision.nextInt();
        int b = comparision.nextInt();
        int c = comparision.nextInt();
        int d = comparision.nextInt();
        if(a>b&&a>c&&a>d){
            System.out.print(a);
        }    
        else if(b>c&&b>d){
            System.out.print(b);
        }
        else if(c>d){
            System.out.print(c);
        }
        else{
            System.out.print(d);
        }

        comparision.close();
        

        
    }
    
}
