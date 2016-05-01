/**
 * Created by hogarth on 2016/5/1.
 * 1.8 Assume you have a method isSubstring which checks if one word is a
 * substring of another. Given two strings, si and s2, write code to check if s2 is
 * a rotation of si using only one call to isSubstring (e.g.,"waterbottle"is a rotation
 * of "erbottlewat").
 */

import java.util.*;
 
public class ReverseEqual {
    public boolean checkReverseEqual(String s1, String s2) {
         String s3 = s1+s1; 
         if (s3.contains(s2))
            return true;
         else
            return false;
    }
}
