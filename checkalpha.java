import java.util.*;
public class checkalpha {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char a = scan.next().charAt(0);
        if((a>='a'&&a<='z') || (a>='A'&&a<='Z')){
            System.out.print("Alphabet");
        }
        else{
            System.out.print("NOt");
        }
        scan.close();
    }
    
}
