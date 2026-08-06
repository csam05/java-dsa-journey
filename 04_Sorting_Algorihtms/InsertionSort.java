public class InsertionSort {
    static void insertionSort(int arr[]) {
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            int currValue = arr[i];
            int prev = i - 1;

            while(prev >= 0 && currValue < arr[prev]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = currValue;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 3, 1};

        insertionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}