class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);

            if (ch != ')') {
                st.push(ch);
            } else {
                Queue<Character> q = new LinkedList<>();
                while (!st.isEmpty() && st.peek() != '(') {
                    q.add(st.pop());
                }
                st.pop();
                while (!q.isEmpty()) {
                    st.push(q.remove());
                }
            }
        }

        char[] ans = new char[st.size()];
        for (int i=ans.length-1;i>=0;i--) {
            ans[i] = st.pop();
        }

        return new String(ans);

    }
}