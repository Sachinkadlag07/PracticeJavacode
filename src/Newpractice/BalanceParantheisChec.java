package Newpractice;

import java.util.Stack;

public class BalanceParantheisChec {


    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();

        for(char ch:str.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else if(ch==')'||ch=='}'||ch==']'){
                if (st.isEmpty()){
                    return false;
                }
                char pop = st.pop();
                if((ch == ')' && pop != '(') || (ch == '}' && pop != '{') || (ch == ']' && pop != '[')){
                    return false;
                }

            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {

        String st = "{[()]}";
        System.out.println(isBalanced(st));

    }
}
