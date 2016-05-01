/**
 * Created by hogarth on 2016/5/1.
 * 1.3 Given two strings, write a method to decide if one is a permutation of the other.
 */
import java.util.*;

public class Same {
    public boolean checkSam(String stringA, String stringB) {
        char[] cha = stringA.toCharArray();
        Arrays.sort(cha);
        char[] chb = stringB.toCharArray();
        Arrays.sort(chb);
             
        if(Arrays.toString(cha).equals(Arrays.toString(chb)))
            return true;
        else
            return false;
    }
}
