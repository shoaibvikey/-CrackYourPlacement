/*class Solution 
{ 
	public static long[] productExceptSelf(int arr[], int n) 
	{ 
        long productArray[] = new long[n];
        long product = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j)
                    continue;
                else{
                    product *= arr[j];
                }
            }
            productArray[i] = product;
            product = 1;
        }
        return productArray;
	} 
} */