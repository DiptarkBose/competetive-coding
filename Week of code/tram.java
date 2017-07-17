import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String onceInATram(int x) {
       x++;
        String t=Integer.toString(x);
        String s1=t.substring(0,3);
        String s2=t.substring(3,6);
        int sum1=(Character.digit(s1.charAt(0),10)+Character.digit(s1.charAt(1),10)+Character.digit(s1.charAt(2),10));
        int sum2=(Character.digit(s2.charAt(0),10)+Character.digit(s2.charAt(1),10)+Character.digit(s2.charAt(2),10));
        int d1=Integer.parseInt(s1);
        int d2=Integer.parseInt(s2);
        while(sum2!=sum1){
                        if(d2==999){
                d1++;
                d2=000;           
                s1=Integer.toString(d1);
                 s2=Integer.toString(d2);
                 sum1=(Character.digit(s1.charAt(0),10)+Character.digit(s1.charAt(1),10)+Character.digit(s1.charAt(2),10));
                 sum2=(Character.digit(s2.charAt(0),10)+Character.digit(s2.charAt(1),10)+Character.digit(s2.charAt(2),10));
            }
            else{d2++;
                 s1=Integer.toString(d1);
                 s2=Integer.toString(d2);
                 sum1=(Character.digit(s1.charAt(0),10)+Character.digit(s1.charAt(1),10)+Character.digit(s1.charAt(2),10));
                 sum2=(Character.digit(s2.charAt(0),10)+Character.digit(s2.charAt(1),10)+Character.digit(s2.charAt(2),10));
                
            }
            
        
        
        }
        s1=Integer.toString(d1);
        s2=Integer.toString(d2);
        t=s1+s2;
        return t;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String result = onceInATram(x);
        System.out.println(result);
    }
}
