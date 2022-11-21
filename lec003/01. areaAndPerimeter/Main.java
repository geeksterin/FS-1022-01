import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int l = scn.nextInt();
        int b = scn.nextInt();
        
        int area = l * b;
        int perimeter = 2*(l + b);
        
        System.out.println(area);
        System.out.print(perimeter);
        
       
    }
}