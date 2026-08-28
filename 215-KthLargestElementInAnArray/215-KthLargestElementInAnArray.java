// Last updated: 28/8/2026, 2:49:10 pm
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
        
    }
}