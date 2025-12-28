import java.util.*;

public class Result {

    public static void main(String[] args){
        Scanner result = new Scanner(System.in);
        String Name = result.nextLine();
        double marks = result.nextInt();
        result.nextLine();
        String Department = result.nextLine();
        marks/=10;
        System.out.println("Student Name : " +Name);
        System.out.println("Student Grade = " +marks+"/10");
        System.out.print("Department :" +Department);
        result.close();
        


    }
}