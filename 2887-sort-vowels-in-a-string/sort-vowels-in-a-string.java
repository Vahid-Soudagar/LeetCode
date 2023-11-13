class Solution {
    public String sortVowels(String s) {
        List<Character> list = new ArrayList<>();
        for (int i = 0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                list.add(ch);
            }
        }
        Collections.sort(list, Character::compare);
        System.out.println(list);
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                sb.append(list.remove(0));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i'
            || ch == 'A' || ch == 'E' || ch == 'O' || ch == 'U' || ch == 'I') {
            return true;
        }

        return false;
    }
}