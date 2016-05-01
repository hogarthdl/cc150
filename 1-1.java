/**
 * Created by hogarth on 2016/5/1.
 * 1.1 Implement an algorithm to determine if a string has all unique characters. What
 * if you cannot use additional data structures?
 */

import java.util.*;
 
public class Different {
    public boolean checkDifferent(String iniString) {
         for(int i=1; i<iniString.length()-1;i++){
            for(int j=0;j<i;j++){
                if(iniString.charAt(i) == iniString.charAt(j))
                    return false;
            }  
        }
        return true;
    }
    
    // anothor solution
    public boolean checkDifferent0(String iniString) {
        for(int i=1; i<iniString.length();i++){
            if(iniString.substring(0, i).contains(iniString.substring(i, i+1)))
                return false;
        }
        return true;
    }
}
