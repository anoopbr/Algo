/*
* A number is called as a stepping number if the adjacent digits are having a difference of 1. 
* For eg. 8,343,545 are stepping numbers. While 890, 098 are not. The difference between a ‘9’ 
* and ‘0’ should not be considered as 1. Given start number(s) and an end number(e) your function 
* should list out all the stepping numbers in the range including both the numbers s & e.
*/

import java.lang.Math.*;

class FindSteppingNumber{
 
    static void Dfs(long s, long e , long length , long num)
    {
        if (length-1 == 0)
        {
            if ( s <= num && num <=e)
                System.out.println(num);
            return;
        }
        long lastDigit = num%10;
        if (lastDigit == 0)
        {
            Dfs(s , e,length-1 , num*10+1);
        }
        else if (lastDigit == 9)
        {
            Dfs(s, e, length - 1, num*10 + 8);
        }
        else
        {
            Dfs(s , e,length-1 , num*10+lastDigit-1);
            Dfs(s , e,length-1 , num*10+lastDigit+1);
        }
    }

    public static void main(String[] args)
    {
        long s = 1;
        long e = 10000000;
        long sLength = (int)Math.floor(Math.log10(s) + 1);
        long eLength = (int)Math.floor(Math.log10(e) + 1);
        for (long i = sLength; i <= eLength; ++i)
        {
    //no leading zero
            for (long j = 1; j < 10; ++j)
            {
                Dfs(s , e, i , j);
            }
        }
    }   


}

