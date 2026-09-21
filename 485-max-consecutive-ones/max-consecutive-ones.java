class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int num = 0;
        int maxmi=0;
        int count = 0;

        for (int i = 0; i< nums.length ; i++){
            num = nums[i];
            if (num == 1 ){
                count ++;
            }
            if (num == 0 ){
                if (count < maxmi){
                    count =0;
                }else{
                    maxmi = count;
                    count = 0;
                }
            }
            if(count> maxmi){
maxmi = count;
            }
        }

        return maxmi;
    }
}