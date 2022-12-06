import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int i = 0;
        
        boolean smallCase = true;
        
        while(i < 26){
            char ch = (char)(i + 'a');
            
            
            if(smallCase == true){
                //print smallcase character
                System.out.println(ch);
                smallCase = false;
                
            }
            else{
                //false--> upper case char
                System.out.println(Character.toUpperCase(ch));
                smallCase = true;
            }

            
            i+=2;
            
        }
        
    }
}