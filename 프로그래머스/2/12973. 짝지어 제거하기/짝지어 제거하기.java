import java.util.Stack; // Stack 자료구조를 사용하기 위해 import

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>(); // 문자(Character) 저장을 위한 스택 생성

        // 문자열을 처음부터 끝까지 순회하면서 스택을 활용하여 짝을 제거
        for (char ch : s.toCharArray()) { // 문자열을 문자 배열로 변환하여 하나씩 순회
            // 스택이 비어있지 않고, 스택의 맨 위(top) 문자와 현재 문자가 같다면 제거(pop)
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop(); // 짝을 이루는 문자 제거
            } else {
                stack.push(ch); // 짝을 이루지 않으면 스택에 추가
            }
        }

        // 모든 문자가 제거되어 스택이 비어있으면 1 반환, 그렇지 않으면 0 반환
        return stack.isEmpty() ? 1 : 0;
    }
}
