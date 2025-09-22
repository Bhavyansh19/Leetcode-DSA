class Solution {
    public List<List<Integer>> generate(int n) {
        int[][] ans = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                if(j == 0 || i == j){
                    ans[i][j] = 1;
                } else{
                    ans[i][j] = ans[i-1][j-1] + ans[i-1][j];
                }
            }
        }
        
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < n; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                row.add(ans[i][j]);
            }
            result.add(row);
        }
        
        return result;
    }
}