class Solution {
    public boolean isValid(String s) {

        
        int i = 0;
        int n = s.length();

        Stack<Character> st = new Stack<>();

        while (i < n) {

            char ch = s.charAt(i);

            if (ch == '{' || ch == '(' || ch == '[') {

                st.push(ch);
            }
            else {

                if(st.isEmpty()) return false;

                char top=st.peek();

                if (ch == ')' && top == '(' || ch == '}' && top == '{' || ch == ']' && top == '[')
                    st.pop();

                else return false;


            }
            i++;


        }

        return st.isEmpty();
        
    }
}