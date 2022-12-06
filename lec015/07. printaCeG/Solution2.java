import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int i = 0;
        int swap = 0;
        
        
        while(i < 26){
            char ch = (char)(i + 'a');
            
            if(swap % 2 == 0){
                System.out.println(ch);
            }
            else{
                System.out.println(Character.toUpperCase(ch));
            }
            
            i+=2;
            swap++;
            
        }
        
    }
}