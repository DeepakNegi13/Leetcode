class Solution {
    public String removeStars(String s) {
        // String st = "";
		// for (int i = 1; i < s.length(); i++) if (s.charAt(i) != '*' && s.charAt(i - 1) != '*') st += s.charAt(i - 1);
		// if (s.charAt(s.length() - 1) != '*') st += s.charAt(s.length() - 1);
		// return st;




		Stack<Character> st = new Stack<>();
		for(int i = 0;i<s.length();i++){
			if(s.charAt(i)=='*') st.pop();
			else st.push(s.charAt(i));
		}
		Stack<Character> st2 = new Stack<>();
		while(!st.isEmpty()){
			st2.push(st.pop());
		}
		String ans = "";
		while(!st2.isEmpty()){
			ans += st2.pop();
		}
		return ans;
	}
}