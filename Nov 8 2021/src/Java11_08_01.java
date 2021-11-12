public class Java11_08_01 {
    public static int maxProfit(int[] iPrices) {
        int[] iPair = {-1,-1};
        for (int i : iPrices) {
            iPair[0] = iPair[0]==-1?i:Math.min(iPair[0],i);
            iPair[1] = iPair[1]==-1?i:Math.max(iPair[1],i);
        }
        return iPair[1] - iPair[0];
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {14,12,70,15,99,65,21,90}));
        System.out.println(maxProfit(new int[] {84,70,42,56}));
        System.out.println(maxProfit(new int[] {19,38,76,133}));
        System.out.println(maxProfit(new int[] {120,300,95,425,625}));
    }
}
