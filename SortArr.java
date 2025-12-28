import java.util.*;
public class SortArr {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int n = scan.nextInt();
        scan.nextLine();
        String[] names = new String[n];
        for(int i=0;i<n;i++){
            names[i]=scan.nextLine();
        }
        Arrays.sort(names);
        System.out.println("The sorted names are :");
        for(String name :names){
            System.out.println(name);
        }
        scan.close();
    }
}
