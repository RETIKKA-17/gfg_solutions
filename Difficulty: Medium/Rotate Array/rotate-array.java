class Solution {
    public void rotateArr(int arr[], int d) {
        int n=arr.length;
        d=d%n;
        int start=0;
        int end=d-1;
        while(start<end)
        {
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        start =d;
        end=n-1;
        while(start<end)
        {
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        start =0;
        end=n-1;
        while(start<end)
        {
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
       
    }
}