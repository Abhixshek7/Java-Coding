import java.util.*;
public class revbinary {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int decimal = scan.nextInt();
        String binary = Integer.toBinaryString(decimal);
        String revBinary = new StringBuilder(binary).reverse().toString();
        int revDec = Integer.parseInt(revBinary,2);
        System.out.print(revDec);
        scan.close();

    }
}
