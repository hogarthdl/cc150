/**
 * Created by hogarth on 2016/5/1.
 * 1.7 Write an algorithm such that if an element in an MxN matrix is 0, its entire row
 * and column are set to 0.
 */
import java.util.*;

public class Clearer {
    public int[][] clearZero(int[][] mat, int n) {
        boolean[] row = new boolean[mat.length];
        boolean[] col = new boolean[mat[0].length];
         
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
         
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(row[i] == true || col[j] == true){
                    mat[i][j] = 0;
                }
            }
        }
        return mat;
    }
     
}
