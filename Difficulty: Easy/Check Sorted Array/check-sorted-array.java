class Solution {
    public boolean isSorted(int[] arr) {
    int n;
    n=arr.length-1;
    for(int i=0;i<n;i++)
    {
        if(arr[i]>arr[i+1])
            return false;
    }
    return true;
        
    }
}