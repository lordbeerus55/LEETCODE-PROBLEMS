class Solution {
    public List<String> commonChars(String[] words) {
        String s = words[0];
        Map<Character, Integer> firststringmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            firststringmap.put(s.charAt(i), firststringmap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> otherstringmap = new HashMap<>();
            for (int j = 0; j < words[i].length(); j++) {
                otherstringmap.put(words[i].charAt(j), otherstringmap.getOrDefault(words[i].charAt(j), 0) + 1);
            }
            for (Character key : firststringmap.keySet()) {
                if ((otherstringmap.containsKey(key) && firststringmap.get(key) > 0)) {
                    firststringmap.put(key, Math.min(firststringmap.get(key), otherstringmap.get(key)));
                }

                else {
                    firststringmap.put(key, 0);
                }
            }
        }
        System.out.println(firststringmap);
        List<String> list = new ArrayList<>();
        for (Character key : firststringmap.keySet()) {
            if (firststringmap.get(key) > 0) {
                for (int i = 0; i < firststringmap.get(key); i++)
                    list.add(key + "");
            }
        }
        return list;
    }
}
