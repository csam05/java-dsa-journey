public class MultiplyBy10 {

    static int[] multiplyBy10(int arr[]) {

        int newArr[] = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {

            newArr[i] = arr[i] * 10;
        }

        return newArr;
    }


    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        int ans[] = multiplyBy10(arr);

        for(int i : ans) {
            System.out.println(i);
        }
    }
}