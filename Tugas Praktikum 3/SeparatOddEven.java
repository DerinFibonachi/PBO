package SortCollection;

class SeparateOddEven {
    void separate(int[] arr) {
        int n = arr.length;
        int[] odd = new int[n];
        int[] even = new int[n];
        int oddCount = 0, evenCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even[evenCount++] = arr[i];
            } else {
                odd[oddCount++] = arr[i];
            }
        }

        System.out.println("Odd numbers:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();

        System.out.println("Even numbers:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();
    }
}