class Solution {
    public int maximumWealth(int[][] accounts) {
        int rich =0;
        for(int i =0;i<accounts.length; i++){

            int current = 0;
            for (int j =0;j < accounts[i].length;j++){
                current = current+accounts[i][j];
            }

            if(current>rich){
                rich =current;
            }
            current = 0;
        }
        return rich;
    }
}