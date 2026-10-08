class Solution {
    boolean vowel (char c){
        return (c=='a'|| c=='e'||c=='i'||c=='o'||c=='u');
    }
    public int maxVowels(String s, int k) {
        char []arr=s.toCharArray();
        int count=0;
        for(int i=0; i<k; i++){
            if (vowel(arr[i])) count++;
        }
        int max=count;
        for(int i=k; i<arr.length;i++){
            if(vowel(arr[i])) count++;
            if(vowel(arr[i-k])) count--;
            max=Math.max(max,count);
        }
        return max;
        
    }
}