import java.util.*;

public class lcm {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int max = (num1>num2)?num1:num2;
        while(true){
            if(max%num1==0&& max%num2==0){
                System.out.print(max);
                break;
            }
            max++;
        }
        scan.close();
    }
}