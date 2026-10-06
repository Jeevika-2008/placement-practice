class Solution {
    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();
        int n = arr.length;

        int l = 0, r = n - 1;

        while (l < r) {

            if (!vowel(arr[l]))
                l++;

            else if (!vowel(arr[r]))
                r--;

            else {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;

                l++;
                r--;
            }
        }

        return new String(arr);
    }

    boolean vowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' ||
               c == 'O' || c == 'U';
    }
}