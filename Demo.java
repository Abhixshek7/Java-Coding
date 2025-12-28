import java.util.*;
class Sum{
    public int add(int a, int b) {
        int result = a+b;
        return result;
    }
}

public class Demo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        Sum addition = new Sum();
        int result = addition.add(n1,n2);
        System.out.print(result);
        scan.close();
    }
    
}
