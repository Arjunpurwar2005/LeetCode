class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
         int count =0;
        int sum=0;
        HashMap<Integer,Integer>map= new HashMap<>();
        for(int val:nums){
            if(val%2==0){

                val=0;
            }
            else{
                val=1;
            }
            sum=sum+val;
            if(sum==k){
                count=count+1;
            }
            if(map.containsKey(sum-k)){
                count=count+map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
        
    }
}