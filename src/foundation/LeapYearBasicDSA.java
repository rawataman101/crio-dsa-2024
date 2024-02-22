package foundation;

import java.util.*;


public class LeapYearBasicDSA{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean res = leapYearBasic(N);
        System.out.println(res);
    }

    static boolean leapYearBasic(int n){
        if(n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
}
