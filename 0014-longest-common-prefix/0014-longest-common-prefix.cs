public class Solution {
    public string LongestCommonPrefix(string[] strs) {
      if(strs == null || strs.Length ==0)
      {
        return string.Empty;
      }
      string longestprefix = strs[0];
      for(int i = 1; i < strs.Length;i++)
      {
        while(!strs[i].StartsWith(longestprefix))
        {
            longestprefix = longestprefix.Substring(0,longestprefix.Length - 1); // remove last character
            if(string.IsNullOrEmpty(longestprefix))
            {
                return "";
            }

        }

      }
      return longestprefix;
    }
}