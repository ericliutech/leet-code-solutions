public class Solution {
    public int arrayPairSum(int[] nums) {
        int[] sorted = mergeSort(nums, 0, nums.length - 1);
        int n = 0;
        for (int i = 0; i < sorted.length; i += 2){
            n += sorted[i];
        }
        return n;
    }
    
    public static int[] mergeSort(int[] nums, int left, int right){
        if (right > left){
            int mid = (left + right) / 2;
            int[] leftSorted = mergeSort(nums, left, mid);
            int[] rightSorted = mergeSort(nums, mid + 1, right);
            return merge(leftSorted, rightSorted);
        } else {
            return new int[]{nums[left]};
        }
    }
    
    public static int[] merge(int[] left, int[] right){
        int[] sorted = new int[left.length + right.length];
        int lPtr, rPtr, curr;
        lPtr = 0;
        rPtr = 0;
        curr = 0;
        while (lPtr < left.length && rPtr < right.length){
            if (left[lPtr] < right[rPtr]){
                sorted[curr] = left[lPtr];
                lPtr++;
            } else {
                sorted[curr] = right[rPtr];
                rPtr++;
            }
            curr++;
        }
        while (lPtr < left.length){
            sorted[curr] = left[lPtr];
            lPtr++;
            curr++;
        }
        while (rPtr < right.length){
            sorted[curr] = right[rPtr];
            rPtr++;
            curr++;
        }
        return sorted;
    }
}
