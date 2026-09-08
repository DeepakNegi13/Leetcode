class Solution {
    public String helper(int k, String st) {
		if(st.length()>k) return st;
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String newSt = "";
		for (int i = 0; i < st.length(); i++) {
			for (int j = 0; j < alpha.length(); j++) {
				if (alpha.charAt(j) == st.charAt(i)) {
                    if(alpha.charAt(j)=='z') newSt = newSt + 'a';
					else newSt = newSt + alpha.charAt(j + 1);
					break;
				}
			}
		}
		st = st + newSt;
		st = helper(k,st);
		return st;
	}
    public char kthCharacter(int k) {
        String st = "a";
        st = helper(k,st);
        return st.charAt(k-1);
    }
}