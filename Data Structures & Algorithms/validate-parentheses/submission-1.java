class Solution {
    public boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();

        Map<Character, Character> map = Map.of(')','(','}','{',']','[');

        for(int i=0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                if(deque.isEmpty() || deque.pop() != map.get(c)) {
                    return false;
                }
            } else {
                deque.push(c);
            }
        }

        return deque.isEmpty();
    }
}
