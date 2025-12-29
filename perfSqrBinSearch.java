    import java.util.Scanner;
    public class perfSqrBinSearch {

        public static int perfSqrBin(int target){
            int left = 1 ;
            int right = target/2;
            while(left<=right){
                int mid = left + (right-left)/2;
                int square = mid*mid;
                if(square==target){
                    return mid;
                }
                else if(square>target){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                } 
            }
            return -1;
        }

        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result = perfSqrBin(num);
        if(result == -1){
            System.out.println(num+ " is not a perfect square");
        } 
        else{
            System.out.println(num + " is a prefect square");
        }
        scan.close();
        }

    }