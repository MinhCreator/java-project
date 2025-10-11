public static int factorial(int num) {
        int[] arr = new int[num + 1];
        arr[0] = 1;
        // arr[1] = 1;

        for (int i = 1; i <= num; i++) {

            arr[i] = i * arr[i - 1];

        }
        return arr[num];
    }
