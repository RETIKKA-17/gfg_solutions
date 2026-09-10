class Solution {
    int sumOfSeries(int n) {
      int i,a,sum=0;
      for(i=1;i<=n;i++)
      {
          a=i*i*i;
          sum+=a;
          
      }
      return sum;
    }
}