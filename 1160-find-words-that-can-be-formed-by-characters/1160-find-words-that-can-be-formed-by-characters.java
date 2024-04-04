class Solution {
    public boolean goodstringcheck(HashMap<Character, Integer> pm, String str) {
        HashMap<Character, Integer> wordsmap = new HashMap<>(pm);

        for (int j = 0; j < str.length(); j++) {
            if (!wordsmap.containsKey(str.charAt(j))) {
                return false;
            } else {
                if (wordsmap.get(str.charAt(j)) == 1) {
                    wordsmap.remove(str.charAt(j));

                } else {
                    wordsmap.put(str.charAt(j), wordsmap.get(str.charAt(j)) - 1);
                }
            }

        }
        return true;

    }

    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> charsmap = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            charsmap.put(chars.charAt(i), charsmap.getOrDefault(chars.charAt(i), 0) + 1);
        }
        int answer = 0;
        for (int i = 0; i < words.length; i++) {
            if (goodstringcheck(charsmap, words[i])) {
                answer += words[i].length();
            }
        }

        return answer;
    }
}