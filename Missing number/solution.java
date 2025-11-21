class Solution {
    public int missingNumber(int[] nums) {
        int[] arr = new int[nums.length+1];
        for(int i:nums){
            arr[i]++;
        }int val=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) val=i;
        }
        return val;
    }
}
