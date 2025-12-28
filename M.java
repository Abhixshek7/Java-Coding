import java.util.*;
public class M {
     
    public static void greetName(String s){
        System.out.println("Whats up my nigga," + s);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        greetName(name);
        scan.close();
    }
    
}