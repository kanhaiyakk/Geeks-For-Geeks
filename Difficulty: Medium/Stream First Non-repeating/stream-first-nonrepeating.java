class Solution {
    public String FirstNonRepeating(String s) {
        // code here
         StringBuilder result = new StringBuilder();
        Map<Character, Integer> freq = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            queue.offer(ch);

            // Remove repeated characters from front
            while (!queue.isEmpty() && freq.get(queue.peek()) > 1) {
                queue.poll();
            }

            // Append first non-repeating or '#'
            if (!queue.isEmpty()) {
                result.append(queue.peek());
            } else {
                result.append('#');
            }
        }

        return result.toString();
    }
}