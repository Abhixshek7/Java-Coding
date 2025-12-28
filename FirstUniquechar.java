import java.util.*;
public class FirstUniquechar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
       
        for(int i =0;i<str.length();i++){
            boolean found = false;
            for(int j = 0;j<str.length();j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    found = true;
                    break;
                }
            }
        
        if(found == false){
            System.out.print(str.charAt(i));
        }
    }
    scan.close();
    }
}
