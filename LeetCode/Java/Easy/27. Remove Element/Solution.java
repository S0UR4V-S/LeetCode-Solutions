class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                count ++;
                nums[c]=nums[i];
                c++;
            }}
            for(int i=c;i<nums.length;i++){
                nums[i]=val;
            }
            return count;
        }
    }
