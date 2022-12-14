import java.io.*;
import java.util.*;

public class Solution {
    //defining a function
    public static int sum(int x, int y){
        return x + y;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        //calling
        int ans = sum(x,y);
        System.out.println(ans);
    }
}