package crio.bitwise;

public class Convert2Binary {
    public static void main(String[] args) {
        System.out.println(getBinary(13));
        System.out.println(getDecimal("1101"));
    }

    static String getBinary(int num) {
        StringBuilder ans = new StringBuilder();

        while (num != 0) {
            if (num % 2 == 0) ans.append("0");
            else ans.append("1");
            num /= 2;
        }
        return ans.reverse().toString();
    }

    static int getDecimal(String num) {
        int p = 1;
        int ans = 0;
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i)) == '1') {
                ans += p;
            }
            p *= 2;
        }
        return ans;
    }
}


// time/ space -> log2N