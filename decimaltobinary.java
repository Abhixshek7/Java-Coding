import java.util.*;
public class decimaltobinary {

    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int decimal  = scan.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.print(binary);
        scan.close();
     
    }
}