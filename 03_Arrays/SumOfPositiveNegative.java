public class SumOfPositiveNegative {


    static int[] sumOfPosNeg(int arr[]) {

        int posSum = 0;
        int negSum = 0;


        for(int i : arr) {

            if(i >= 0)
                posSum += i;
            else
                negSum += i;
        }


        return new int[]{posSum, negSum};
    }


    public static void main(String[] args) {

        int arr[] = {12,0,-34,90,-98};

        int ans[] = sumOfPosNeg(arr);

        System.out.println("Positive sum: " + ans[0]);
        System.out.println("Negative sum: " + ans[1]);
    }
}