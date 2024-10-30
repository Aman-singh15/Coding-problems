//Given a string s, reverse only all the vowels in the string and return it.
//The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.


class Solution {
    public String reverseVowels(String s) {
        String ans = "";
        int i = 0;
        int j = s.length() - 1;
        char[] chars = s.toCharArray();
        
        while (i < j) {
            if ((isVowel(chars[i])) && (isVowel(chars[j]))) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            } else if (!isVowel(chars[i])) {
                i++;
            } else if (!isVowel(chars[j])) {
                j--;
            }
        }
        
        // Convert the character array back to a string
        return new String(chars);
    }

    private boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}

