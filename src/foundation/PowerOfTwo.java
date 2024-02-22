package foundation;

import java.util.*;


public class PowerOfTwo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(powerOfTwo(n));
    }

    static boolean powerOfTwo(int n){
        if((n & (n - 1)) == 0) 
            return true;
        else 
            return false;
    }
}
