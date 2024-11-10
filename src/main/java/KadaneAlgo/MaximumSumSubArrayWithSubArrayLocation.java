package KadaneAlgo;


public class MaximumSumSubArrayWithSubArrayLocation {

    public static int[] maxSubArray(int[] nums) {

        if (nums == null || nums.length == 0) return null;

        int maxEnding = nums[0];
        int res = nums[0];
        int l = 0, r = 0;

        for (int i = 1; i < nums.length; i++) {

            if(nums[i] > maxEnding+nums[i]) {
                maxEnding = nums[i];
                l = i;
                r = i;
            }else{
                maxEnding =  maxEnding+nums[i];

            }

            if(res < maxEnding) {
                res = maxEnding;
                r = i;
            }

        }

        return new int[]{l,r,res};
    }

    public static void main(String[] args) {

//        int[] nums = {1,0,-2,4};
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] result = maxSubArray(nums);
        for(int i :result){
            System.out.println(i);
        }

    }
}
