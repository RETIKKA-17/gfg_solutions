class Solution {
    int factorial(int n) {
        int fact=1;
        int i;
        for(i=1;i<=n;i++)
        {
            
            fact=fact*i;
        }
        return fact;
    }
}
