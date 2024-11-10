package SlidingWindowAlgo;

public class FixedSizeClass {

    public static int[] fixSize(int[] arr, int siz) {

        if(arr == null || arr.length == 0) return null;

        int l = 0, maxSum = 0, k = 0;

        for(int j = 0; j < siz; j++) {
            maxSum += arr[j];
        }

        int windowSum = maxSum;

        for(int i = siz; i < arr.length; i++) {

                windowSum += arr[i] - arr[i-siz];

                if(windowSum > maxSum) {
                    maxSum = windowSum;
                    l = i-siz+1;
                }
        }
        int[] res = new int[siz];
        for(int i = l; i < l+siz; i++) {
            res[k++] = arr[i];
        }
//        return new int[]{maxSum,l,l+siz-1};
        return res;
    }

    public static void main(String[] args) {

        int[] nums = {1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;

        int[] result = fixSize(nums, k);

        for(int i : result) {

            System.out.printf(i + " ");
        }

    }
}


