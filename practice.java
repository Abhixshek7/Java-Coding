import java.util.*;
public class practice {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.print(maskedEmail(name));
        scan.close();
    }

    public static String maskedEmail(String name){
        StringBuilder maskedName = new StringBuilder(name);
        int n = name.indexOf('@');
        for(int i=1;i<n-1;i++)
        maskedName.setCharAt(i,'*');
     return maskedName.toString();
}
    }
   