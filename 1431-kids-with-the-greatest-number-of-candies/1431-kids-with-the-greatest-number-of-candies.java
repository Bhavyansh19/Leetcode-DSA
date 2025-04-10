class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max_candy = 0;
        for(int i : candies){
            if(i > max_candy){
                max_candy = i;
            }
        }
        List<Boolean> result = new ArrayList<>();
        for(int i : candies){
            result.add(i + extraCandies >= max_candy);
        }
        return result;
    }
}