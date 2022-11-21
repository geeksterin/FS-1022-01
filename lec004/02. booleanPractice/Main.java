public class Main {

    public static void main(String[] args) {
        boolean A = true;
        boolean B = true;
        boolean C = false;
        boolean D = false;


        boolean ans1 = (A && B) && (C || D);
        boolean ans2 = (A || (B && D)) || C;
        boolean ans3 = (A || D) || (B && A) || (A || B);
        
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        
    }
}
