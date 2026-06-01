class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;

        Map<Integer,Integer>mp = new HashMap<>();
        int resI = -1;
        int resJ = -1;

        for(int i=0;i<n;i++){
            if(!mp.containsKey(target-nums[i])){
                mp.put(nums[i],i);
            }else{
                resI = mp.get(target-nums[i]);
                resJ = i;
                break;
            }    
        }

        return new int[]{resI,resJ};
        
    }
}

/*
3 4 1 2 8 6  target=10


*/
