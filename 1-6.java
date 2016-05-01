/**
 * Created by hogarth on 2016/5/1.
 * 1.6 Given an image represented by an NxN matrix, where each pixel in the image is
 * 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
 */
import java.util.*;

public class Transform {
    public int[][] transformImage(int[][] mat, int n) {
         
        int[][] tmp_mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //System.out.println("i="+i+"j="+j);
                tmp_mat[j][n-i-1] = mat[i][j];
            }
        }
        return tmp_mat;
    }
}
