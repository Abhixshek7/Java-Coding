    import java.util.*;
    public class mathfun {
        public static void main(String[] args){
            Scanner scan  = new Scanner(System.in);
            int a = scan.nextInt();
            System.out.print("Number of digits = "+(int)(Math.log10(a)+1));
            scan.close();

        }
    }
