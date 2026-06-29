public class Shiftby1 {

    static void shiftby1(int []arr) {
        int n = arr.length;
        int temp = arr[n-1];

        for (int i=n-1; i>0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        shiftby1(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }
}
