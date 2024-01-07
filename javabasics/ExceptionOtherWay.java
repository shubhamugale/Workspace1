package javabasics;

import java.util.concurrent.TimeoutException;

public class ExceptionOtherWay {
    public static void main(String[] args) {
        String s = "$123";

        try{
            int i = 1;
            int n = Integer.parseInt(s);
            System.out.println(n + i);
        }
     catch(NumberFormatException e){
            String s1 = s.substring(1);
            int n1 = Integer.parseInt(s1);
         System.out.println(n1 + 1);
     }
        // we can add multiple catch blocks
      /*  catch(TimeoutException e1){

        }

       */
// ------------------------------------------------------------------
        finally {
            // Default block - it will execute every time after try and catch block
        }
    }
}
