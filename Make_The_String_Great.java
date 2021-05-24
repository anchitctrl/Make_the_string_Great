class Solution {
    public String makeGood(String s) {
        Stack<Character> stack=new Stack<>();
        char[] chars=s.toCharArray();
        int l=0;
        for(char c:chars){
            if(!stack.isEmpty()){
                int num1=c;
                int num2=stack.peek();
                if(num1-num2==32 || num1-num2==-32){
                    stack.pop();
                    l=l-1;
                }
                else{ 
                    stack.push(c); 
                    l=l+1; 
                }
            }
            else{
                stack.push(c); 
                l=l+1;
            }
        }
        char[] res=new char[l];
        int i=l-1;
        while(!stack.isEmpty()){
            res[i--]=stack.pop();
        }
        return new String(res);
    }
}
