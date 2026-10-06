class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int s=0;
        int e=nums.length-1;
        while(s<e){
            if(nums[s]+nums[e]==target)
                return new int[]{s+1,e+1};
            else if((nums[s]+nums[e])>target)
                e-=1;
            else 
                s+=1;    

        }

        return new int[]{};
    }
}