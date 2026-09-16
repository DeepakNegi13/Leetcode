class Solution {
    //hint:- at any point of time the number of opening brackit is greater then equal to number of cosing bracket
    public List<String> generateParenthesis(int n) {
		List<String> ans = new ArrayList<>();
		String str = new String();
		helperString(n,0,0,ans,str);
		return ans;
	}

	private void helperString(int n, int open,int close, List<String> ans, String str) {
		if( open>n || close>n || open<close ) return ;
		if( open==close && open==n ){
			ans.add(new String(str));
			return;
		}
        helperString(n,open+1,close,ans,str+"(");
        helperString(n,open,close+1,ans,str+")");
        
	}
}