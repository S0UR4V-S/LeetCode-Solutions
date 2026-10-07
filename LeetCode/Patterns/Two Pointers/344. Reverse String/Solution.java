class Solution {
    public void reverseString(char[] nums) {
         int s=0;
        int e=nums.length-1;
        while(s<=e){
            char temp=nums[e];
            nums[e]=nums[s];
            nums[s]=temp;
            e--;
            s++;
        }
    }
}