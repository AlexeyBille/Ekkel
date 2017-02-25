package ch11.ex15;

import java.util.Stack;

public class StackReading {
    public static void main(String[] args) {
        String command = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
        Stack<Character> stack = new Stack<>();
        char[] arr = command.toCharArray();
        for(int i = 0; i < arr.length;i++){
            if(arr[i]=='+'){
                stack.push(arr[i+1]);
                i++;
            }else if(arr[i]=='-'){
                stack.pop();
            }
            System.out.println(arr[i]+" "+stack);
        }

    }
}
