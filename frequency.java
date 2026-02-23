class frequency {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 6 };
        int freq[] = new int[100];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        for (int j = 0; j < arr.length; j++) {
            if (freq[arr[j]] != 0) {

                System.out.println("The number " + arr[j] + " have occured " + freq[arr[j]] + "times");
            }
            freq[arr[j]] = 0;
        }
    }

    
}