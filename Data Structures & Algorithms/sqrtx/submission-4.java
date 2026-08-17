class Solution {
    public int mySqrt(int x) {
        // if(x == 0){
        //     return 0;
        // }
        // int res = 1;
        // for(int i=1;i<=x;i++){
        //     if((long) i * i > x){
        //         return res;
        //     }
        //     res =  i;
        // }
        // return res;


        //return (int) Math.sqrt(x);

        int left = 0;
        int right = x;
        int res = 0;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if((long) mid * mid > x){
                right = mid - 1;
            }else if((long) mid * mid < x){
                left = mid + 1;
                res = mid;
            }else{
                return mid;
            }
        }
        return res;
    }
}