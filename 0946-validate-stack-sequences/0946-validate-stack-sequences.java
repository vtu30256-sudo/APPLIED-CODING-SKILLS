import java.util.Stack;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s = new Stack<>();
        int i = 0;

        for (int input : pushed) {
            s.push(input);

            while (!s.isEmpty() && i < popped.length && s.peek() == popped[i]) {
                s.pop();
                i++;
            }
        }

        return s.isEmpty();
    }
}