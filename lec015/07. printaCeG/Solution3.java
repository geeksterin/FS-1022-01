import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       for( char  i='a' ,j='C';i<='z';i+=4,j+=4){
         
            System.out.println((char)i);
           if(j <= 'Z')
             System.out.println((char)j);
       }

        
    }
}