class Solution {
    public int missingNumber(int[] nums) {
        // HashSet<Integer> set =new HashSet<>();
        // int mis=0;
        
        // for(int i=0;i<nums.length;i++){
        //     set.add(nums[i]);
            

        // }
        // for(int i=0;i<=nums.length;i++){
        //     if(!set.contains(i)){
        //         mis=i;
        //     }
        // }
        // return mis;
        
        // for(int i=0;i<nums.length;i++){
        //     res=nums[i]^i^res;
        // }
        // return res;
        int i=0;
        while( i<nums.length){
            int crct=nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[crct]){
                int temp=nums[i];
                nums[i]=nums[crct];
                nums[crct]=temp;

            }
            else{
                i=i+1;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return nums.length;
       

    }
}