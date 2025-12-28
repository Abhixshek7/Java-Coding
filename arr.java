import java.util.*;

public class arr {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for(int i=0;i<10;i++){
      arr.add(i);
    }
    System.out.print(arr.get(9));
  }
}