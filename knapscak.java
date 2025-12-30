//0/1 knapscak

class Main{
    static int knapsack(int[] w , int[] value , int capacity){
        int n = w.length;
        int[][] dp = new int[n + 1][capacity + 1];
        for(int i = 1 ; i <= n; i++){
            for(int j = 1 ; j <= capacity ; j++){
                if(w[i - 1] <= j){
                    dp[i][j] = Math.max(value[i - 1] + dp[i - 1][j - w[i - 1]] , dp[i - 1][j]);                 
                }else{
                    dp[i][j] = dp[i - 1][j];
                }    
            }
        }
        return dp[n][capacity];
    }
    public static void main (String[] args) {
        int[] w = {3 , 4 , 5, 6};
        int[] value = {30, 20, 25, 40};
        
        int capacity = 9;
        int maxVlaue = knapsack(w , value , capacity);
        System.out.println(maxVlaue);
    }   
}