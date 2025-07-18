class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char firstChar = word.charAt(0);

            if ("AEIOUaeiou".indexOf(firstChar) != -1) {
                result.append(word);
            } else {
                result.append(word.substring(1));
                result.append(firstChar);
            }

            result.append("ma");

            // Append 'a' i+1 times
            for (int j = 0; j <= i; j++) {
                result.append('a');
            }

            result.append(" ");
        }

        return result.toString().trim();
    }
}