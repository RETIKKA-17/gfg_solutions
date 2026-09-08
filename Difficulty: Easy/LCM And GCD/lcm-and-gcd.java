class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int x,y;
        x=a;
        y=b;
        int rem ;
        while(y!=0)
        {
            rem=x%y;
            x=y;
            y=rem;
        }
        int gcd =x;
        int l=(a*b)/gcd;
        return new int[] {l, gcd};
        
    }
}