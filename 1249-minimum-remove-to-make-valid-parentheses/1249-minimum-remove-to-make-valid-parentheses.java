class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        boolean[] remove = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } 
            else if (s.charAt(i) == ')') {
                if (st.isEmpty()) {
                    remove[i] = true;
                } 
                else {
                    st.pop();
                }
            }
        }

        // Remove unmatched '('
        while (!st.isEmpty()) {
            remove[st.pop()] = true;
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (!remove[i]) {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}