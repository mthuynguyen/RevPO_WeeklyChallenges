import java.util.Arrays;

public class Java11_08_02 {
    public static int gcd(int[] iArray) {
        Arrays.sort(iArray);
        int iFactor = 1;
        for (int i = 2; i < iArray[iArray.length-1]/2;i++) {
            boolean bNotFactor = false;
            for (int n : iArray) {
                if (n % i != 0) {
                    bNotFactor = true;
                    break;
                }
            }
            iFactor = bNotFactor?iFactor:i;
        }
        return iFactor;
    }

    public static void main(String[] args) {
        System.out.println(gcd(new int[] {84,70,42,56}));
        System.out.println(gcd(new int[] {19,38,76,133}));
        System.out.println(gcd(new int[] {120,300,95,425,625}));
    }
}
