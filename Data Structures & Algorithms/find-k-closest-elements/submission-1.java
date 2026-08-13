class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int currentDistance = 0;
        for(int i=0;i<k;i++){
            currentDistance += arr[i];
        }

        int bestDistance = currentDistance;
        int bestStart = 0;
        for(int left = 1;left <= arr.length-k;left++){
             currentDistance -= Math.abs((arr[left-1] - x));
             currentDistance += Math.abs((arr[left+ k -1]- x));

             if(currentDistance < bestDistance){
                bestDistance = currentDistance;
                bestStart = left;
             }
        }
        List<Integer> res = new ArrayList<>();
        for(int i = bestStart;i<bestStart + k;i++){
            res.add(arr[i]);
        }
        return res;
    }
}