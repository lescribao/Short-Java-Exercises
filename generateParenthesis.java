class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> results = new ArrayList<String>();
        String toAdd = "";
        recursionMethod(n, toAdd, results);
        return results;
        
    }
    
    private void recursionMethod(int n, String toAdd, List<String> results) {
        
        if(toAdd.length() == 2 * n) {
            results.add(toAdd);
        } else {
            int left = 0;
            int right = 0;
            for(int i = 0; i < toAdd.length(); i++) {
                if(toAdd.charAt(i) == '(') left++;
                if(toAdd.charAt(i) == ')') right++;
            }
            if (left == right) recursionMethod(n, toAdd + "(", results);
            else if(right < left) {
                if(left < n) recursionMethod(n, toAdd + "(", results);
            recursionMethod(n, toAdd + ")", results);
            }
        }
    }
}
