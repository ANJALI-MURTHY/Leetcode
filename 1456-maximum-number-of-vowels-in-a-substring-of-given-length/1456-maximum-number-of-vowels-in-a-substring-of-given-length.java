class Solution {
    //Brute Force Method
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }


    public int maxVowels(String s, int k) {
        //Initialize window
        int maxvow_count = 0;
        for(int i =0 ; i < k ; i++)
        {
            if(isVowel(s.charAt(i)))
            {
                maxvow_count++;
            }
        }

        int curr_rate =maxvow_count ;
        
        for(int i =k; i<s.length(); i++)
        {
            if(isVowel(s.charAt(i-k)))
            {
                curr_rate -=1;
            }

            if(isVowel(s.charAt(i)))
            {
                curr_rate++;
            }
        maxvow_count = Math.max(curr_rate,maxvow_count);

        }
        return maxvow_count;
    }
}
