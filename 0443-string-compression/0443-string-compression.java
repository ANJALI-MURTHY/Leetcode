class Solution {
    public static int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int count =1;
        if(chars.length == 1)
        {
            int res ;
            res = chars.length;
            return res;
        }
        try
        {
            for(int i =0;i<=chars.length-1;i++)
            {
                if(i==0)
                {
                    sb.append(chars[i]);
                }
                else
                {
                    if(chars[i-1] == chars[i])
                    {
                        count += 1;

                    }
                    else
                    {
                        if(count>1) {
                            sb.append(count);
                        }
                        sb.append(chars[i]);
                        count = 1;
                    }
                }

            }
        }
        finally
        {
            if(count>=10)
            {
                String str = String.valueOf(count);
                for(int i= 0;i<=str.length()-1;i++)
                {
                    sb.append(str.charAt(i));
                }
            }
            else if(count > 1 )
            {
                sb.append(count);
            }
        }
        for(int i=0; i<sb.length(); i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}