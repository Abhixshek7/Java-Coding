import java.util.*;
public class twinprime {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        for(int i=2;i<n;i++){
            boolean isprime1=true;
            boolean isprime2=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isprime1=false;
                    break;
                }
            }
            for(int j=2;j<=(i+2)/2;j++){
                if((i+2)%j==0){
                    isprime2=false;
                    break;
                }
            }
            if(isprime1&&isprime2){
                System.out.print("("+i+","+(i+2)+")");
            }
        }
        ob.close();
    }
}
