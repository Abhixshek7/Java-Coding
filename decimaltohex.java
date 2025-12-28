import java.util.*;
public class decimaltohex {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int decimal = scan.nextInt();
        String hex = Integer.toHexString(decimal);
        System.out.print(hex);
        scan.close();
    }
}
