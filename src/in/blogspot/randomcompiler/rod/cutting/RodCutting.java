package in.blogspot.randomcompiler.rod.cutting;

public class RodCutting {
    
    private static int getOptimalCut(int[] arr, int length) {
        int[] optimalPrices = new int[length+1];
        optimalPrices[0] = 0;
        for(int i=1; i<=length; i++) {
            int maxVal = Integer.MIN_VALUE;
            for(int j=0; j<i; j++) {
                maxVal = Math.max(maxVal, arr[j]+optimalPrices[i-j-1]);
            }
            optimalPrices[i] = maxVal;
        }
        return optimalPrices[length];
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 8, 9, 10, 17, 17, 20};
        int optimalCutPrice = getOptimalCut(arr1, arr1.length);
        System.out.println("Price of optimal cut is: " + optimalCutPrice);
        
        int[] arr2 = {3, 5, 8, 9, 10, 17, 17, 20};
        optimalCutPrice = getOptimalCut(arr2, arr2.length);
        System.out.println("Price of optimal cut is: " + optimalCutPrice);
    }
}
