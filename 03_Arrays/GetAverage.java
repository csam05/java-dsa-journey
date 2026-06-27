public class GetAverage {

    public static void main(String[] args) {

        int[] arr = {1, 23, 4, 5, 67};

        System.out.println(getAverage(arr));
    }


    //find the average of array elements
    static double getAverage(int[] arr) {

        double sum = 0;

        for (int i : arr) {
            sum = sum + i;
        }

        int size = arr.length;

        double avg = sum / size;

        return avg;
    }
}