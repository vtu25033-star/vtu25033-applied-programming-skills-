class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(ans.length());
                ans.append(ch);
            }else if(ch != '(' && ch != ')' ){
                ans.append(ch);
            }
            else {
                if(st.size() > 0) {
                    ans.append(ch);
                    st.pop();
                }
            }
        }
        while(st.size()>0){
            ans.deleteCharAt(st.pop());
        }
        return ans.toString();
    }
}