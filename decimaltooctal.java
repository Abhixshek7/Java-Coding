import java.util.*;
public class decimaltooctal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int decimal = scan.nextInt();
        String octal = Integer.toOctalString(decimal);
        System.out.print(octal);
        scan.close();
    }   
}
