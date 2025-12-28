import java.util.*;
public class avgmark {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks of the student(out of 100): ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        float f = (float)((a+b+c+d+e)/5);
        System.out.printf("Average = %.2f%%\n",f);
        String message = (f<35)?"You need to study bitch":"You can still do better bitch!!";
        System.out.print(message);
        scan.close();
    }
}
