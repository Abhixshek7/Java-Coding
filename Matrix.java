
public class Matrix {

  public static void main(String[] args){
    int[][] matrix = new int[3][3];
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        matrix[i][j] = (int)(100+Math.random()*900);
      }
    }
    for(int[] n:matrix){
      for(int j : n){
        System.out.print(j + " ");
      }
      System.out.println();
    }
    
  }
}