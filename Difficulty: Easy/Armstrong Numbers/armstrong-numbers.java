class Solution {
    static boolean armstrongNumber(int n) {
        int rem;
        int temp=n;
        int sum=0;
        while(n>0)
        {
            int d=n%10;
            rem=d*d*d;
            sum+=rem;
            n=n/10;
        }
        if(sum==temp)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}