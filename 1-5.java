/**
 * Created by hogarth on 2016/5/1.
 * 1.5 Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become
 * a2blc5a3. If the "compressed" string would not become smaller than the original
 * string, your method should return the original string.
 */
import java.util.*;
 
public class Zipper {
    public String zipString(String iniString) {
       int i = 0;
        int j = 0;
        int count = 1;
        StringBuilder sb = new StringBuilder("");
 
        for (; i < iniString.length() - 1; i++) {
            j = i + 1;
            if (iniString.charAt(i) != iniString.charAt(j)) {
                sb.append(iniString.charAt(i));
                sb.append(count);
                 
                if (j == iniString.length() - 1) {
                    sb.append(iniString.charAt(j));
                    sb.append(1);
                } else {
                    count = 1;
                }
            } else {
                if (j == iniString.length() - 1) {
                    sb.append(iniString.charAt(j));
                    sb.append(count+1);
                }else{
                    count += 1;
                }
 
            }
        }
        return sb.toString();
    }
     
}
