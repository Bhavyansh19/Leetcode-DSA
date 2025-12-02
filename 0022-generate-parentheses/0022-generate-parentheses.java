class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        reverse(res, 0, 0, "", n);
        return res;
    }
    public void reverse(List<String> res, int left, int right, String s, int n){
        if(s.length() == n * 2){
            res.add(s);
            return;
        }
        if(left < n){
            reverse(res, left + 1, right, s + "(", n);
        }
        if(right < left){
            reverse(res, left, right + 1, s + ")", n);
        }
    }
}