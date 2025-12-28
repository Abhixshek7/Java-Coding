    import java.util.*;
    public class TriangleNum {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            if(triangle(n)){
                System.out.print(n+" is a triangle number");
            }
            else{
                System.out.print(n +" is not a triangle number");
            }
            scan.close();
        }

        public static boolean triangle(int n){
            if(n<0){
                return false;
            }
            int sum = 0;
            for(int i=1;sum<=n;i++){
                sum+=i;
                if(sum==n){
                    return true;
                }
                
            }
            return false;
        }
    }