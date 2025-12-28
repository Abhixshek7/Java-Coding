import java.util.*;
public class perfectsquare {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        int start=ob.nextInt();
        int end=ob.nextInt();
        for(int i=start;i<=end;i++){
            double sqrt=Math.sqrt(i);
            if(sqrt==(int)sqrt){
                System.out.print(i+" ");
            }
        }
        ob.close();
    }
}
