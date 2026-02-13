//Given n non -ve integers representing an elevation map where the width of each bar is 1,
//Compute How much water it will trap after raining
//height = [4 , 2, 0 , 6, 3, 2, 5]

public class trappingWater {

    public static int rainwater(int height[]) {
        int n = height.length;
        int width = 1;
        int totalTrappedWater = 0;

        int left[] = new int[n];
        left[0] = height[0];
        for (int i = 1; i < left.length; i++) {
            left[i] = Math.max(height[i], left[i - 1]);
        }

        int right[] = new int[n];
        right[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(height[i], right[i + 1]);
        }

        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(left[i], right[i]);
            int trappedWater = (waterLevel - height[i]) * width;

            totalTrappedWater += trappedWater;

        }

        return totalTrappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};

        System.out.println("total trapped water is " + rainwater(height));
    }

}
