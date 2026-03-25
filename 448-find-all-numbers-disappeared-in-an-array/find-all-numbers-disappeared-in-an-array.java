class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int crct=nums[i]-1;
            if(nums[i]!=nums[crct]){
                int temp=nums[i];
                nums[i]=nums[crct];
                nums[crct]=temp;
            }
            else{
                i++;
            }

        }
        ArrayList<Integer>list=new ArrayList<>();

     for(int j=0;j<nums.length;j++){
        if(nums[j]!=j+1){
            list.add(j+1);
        }
     }
     return list;
}
}