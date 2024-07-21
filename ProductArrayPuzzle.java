    public static long[] productExceptSelf(int nums[], int n) {
        long[] productArray = new long[n];

        for (int i = 0; i < n; i++) {
            long product = 1;  // Reset product for each i
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    product *= nums[j];
                }
            }
            productArray[i] = product;
        }

        return productArray;
    }
