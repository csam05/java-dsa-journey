public class CountZeroesOnes {


    static int[] countZeroesOnes(int arr[]) {

        int zeroCount = 0;
        int oneCount = 0;


        for(int i : arr) {

            if(i == 0) {
                zeroCount++;
            }
            else if(i == 1) {
                oneCount++;
            }
        }


        return new int[]{zeroCount, oneCount};
    }


    public static void main(String[] args) {

        int arr[] = {1,2,3,4,1,1,1,0,0,0};

        int ans[] = countZeroesOnes(arr);

        System.out.println("Zero count: " + ans[0]);
        System.out.println("One count: " + ans[1]);
    }
}