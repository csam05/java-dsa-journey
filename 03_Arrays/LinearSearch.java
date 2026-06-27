public class LinearSearch {


    static boolean linearSearch(int n, int arr[]) {

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == n) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {

        int arr[] = {10,7,3,90,56};

        int target = 90;

        System.out.println(linearSearch(target, arr));
    }
}