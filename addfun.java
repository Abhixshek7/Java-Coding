import java.util.Scanner;

public class addfun {

    void getChoco(int n){
        if(n>10){
            System.out.print("Extra amount");
        }
        else if(n<10){
            System.out.print("Insufficient amount");
        }
        else{
            System.out.print("Purchased");
        }

    }
    public static void main(String[] args){
        addfun amt = new addfun();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount of the chocolate = ");
        int  n =scan.nextInt();
        amt.getChoco(n);
        scan.close();
    }
}