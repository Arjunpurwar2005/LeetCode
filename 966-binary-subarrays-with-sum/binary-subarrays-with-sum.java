class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
         int count =0;
        int sum=0;
        HashMap<Integer,Integer>map= new HashMap<>();
        for(int val:nums){
            sum=sum+val;
            if(sum==goal){
                count=count+1;
            }
            if(map.containsKey(sum-goal)){
                count=count+map.get(sum-goal);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
        
    }
}