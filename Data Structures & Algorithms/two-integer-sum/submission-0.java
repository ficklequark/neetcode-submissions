class Solution {

    Map<Integer, Integer> map = new HashMap<>();

    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0; i < nums.length; i++) {
            int otherEle = target - nums[i];

            if(map.containsKey(otherEle)) {
                return new int[]{map.get(otherEle), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{}; 
    }
}
