import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
        int i,count=1,i1,a,t=0;
        Character c,d,c1,d1;
        a=s.length();
        for(i=0;i<a-1;i++)
        {c=s.charAt(i);
         if(c.compareTo(' ')==0 || c.compareTo('!')==0 || c.compareTo(',')==0 || c.compareTo('?')==0 || c.compareTo('.')==0 || c.compareTo('_')==0 || c==39 || c.compareTo('@')==0)
         {
          count++;
          d=s.charAt(i);
           while(d.compareTo(' ')==0 || d.compareTo('!')==0 || d.compareTo(',')==0 || d.compareTo('?')==0 || d.compareTo('.')==0 || d.compareTo('_')==0 || d==39 || d.compareTo('@')==0)
              {
              
              d=s.charAt(i);
          }
         
          }
         else
         {t++;
         }
        }        
              
        System.out.println(count);
        for(i=0;i<s.length()-1;i++)
        {c=s.charAt(i);
         if(c.compareTo(' ')==0 || c.compareTo('!')==0 || c.compareTo(',')==0 || c.compareTo('?')==0 || c.compareTo('.')==0 || c.compareTo('_')==0 || c==39 || c.compareTo('@')==0)
         {System.out.println();
          
          d=s.charAt(i);
          while(d.compareTo(' ')==0 || d.compareTo('!')==0 || d.compareTo(',')==0 || d.compareTo('?')==0 || d.compareTo('.')==0 || d.compareTo('_')==0 || d==39 || d.compareTo('@')==0)
              {
              
              d=s.charAt(i);
          }
          }
         else
         {System.out.print(c);
          }
        }    
    }
}
