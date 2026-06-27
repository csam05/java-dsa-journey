public class MaxElement {


    static int maxElement(int arr[]) {

        int max = arr[0];

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }


    public static void main(String[] args) {

        int arr[] = {10,7,3,90,56};

        System.out.println(maxElement(arr));
    }
}