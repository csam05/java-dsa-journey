public class AlternateSwap {


    static int[] getAlternateSwappedArray(int arr[]) {


        for(int i = 0; i < arr.length; i += 2) {

            int temp = arr[i];

            arr[i] = arr[i+1];

            arr[i+1] = temp;
        }


        return arr;
    }


    public static void main(String[] args) {


        int arr[] = {1,2,3,4,5,6};


        int ans[] = getAlternateSwappedArray(arr);


        for(int i : ans) {
            System.out.println(i);
        }
    }
}