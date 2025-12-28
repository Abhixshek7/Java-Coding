import java.util.*;
public class removeSpace {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input1 = scan.nextLine();
        String input2 = scan.nextLine();
        String output = input2.replaceAll(" ","");
        System.out.print(input1 + " and " + output);
        scan.close();
    }
}