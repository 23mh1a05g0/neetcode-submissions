class Solution {
    public int subarraySum(int[] nums, int k) {
        // int count = 0;
        // for(int i=0;i<nums.length;i++){
        //     int sum = 0;
        //     for(int j = i;j<nums.length;j++){
        //         sum += nums[j];
        //         if(sum == k){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int prefixsum = 0;
        for(int num : nums){
            prefixsum += num;
            int target = prefixsum - k;
            if(map.containsKey(target)){
                count += map.get(target);
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
}