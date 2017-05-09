import java.util.Scanner;
import java.util.regex.*;

public class solution
{
   public static void main(String[] args){
       int testCases = 1;
       Exception ext=null;
      while(testCases>0){
         String pattern = "batcatpat(nat";
          try{ Pattern.compile(pattern);
            }catch(Exception e){
               ext = e;
          }if(ext!=null)
          {System.out.println("Invalid");
          testCases--;
          }
          else
          {System.out.println("Valid");
          testCases--;
          }
          
      }
   }
}