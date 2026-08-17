class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for(int num : weights){
            left = Math.max(left,num);
            right += num;
        }

        while(left < right){
            int mid = left + (right - left) / 2;

            int daysUsed = 1;
            int currweight = 0;
            for(int weight: weights){
                if(currweight + weight <= mid){
                    currweight += weight;
                }else{
                    daysUsed++;
                    currweight = weight;
                }
            }

            if(daysUsed <= days){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}