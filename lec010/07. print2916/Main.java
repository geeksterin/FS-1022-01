import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = 2; i <= n; i=i+7){
            System.out.println(i);
        }
    }
}