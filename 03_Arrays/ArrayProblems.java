public class ArrayProblems {

    // find the average of array elements:
    static double getAverage(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum = sum +i;
        }
        int size = arr.length;
        double avg = sum/size;
        return avg;
    }

    //multiply each element of array by 10:
    static int[] multiplyby10(int[] arr) {
        int size = arr.length;
        int newArr[] = new int[size];

        for(int i=0;i<size;i++) {
            int element = arr[i];
            int newElement = element * 10;
            newArr[i] = newElement;
        }
        return newArr;
    }

    //search for an element in an array (Linear search)
    static boolean linearSearch(int n, int arr[]){
        int size = arr.length;
        for(int i=0; i<size; i++) {
            if(arr[i] == n){
                return true;
            }
        }
        return false;
    }

    // Find the maximum elemnet in an array:
    static int maxElement(int arr[]) {
        int max = arr[0];
        for( int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // return sum of positive and negative number:
    static int[] sumOfPosNeg(int arr[]) {
        int posSum = 0;
        int negSum = 0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i]>=0) {
                posSum = posSum + arr[i];
            }
            else {
                negSum = negSum + arr[i];
            }
        }
        int ans[] = {posSum,negSum};
        return ans;
    }

        // count the no of zeroes and ones:
        static int[] countZeroesOnes(int arr[]) {
            int zeroCount = 0;
            int oneCount = 0;
            for( int i=0; i<arr.length; i++) {
                
                if (arr[i] == 0){
                    zeroCount++;
                }
                else if(arr[i] == 1) {

                    oneCount++;
                }
            }
            int ans[] = {zeroCount,oneCount};
            return ans;
        }

        //find the first unsorted element in an array: (given there is one pakka unsorted element in question)
        static int getUnsortedElement (int arr[]) {
            for (int i=0;i<arr.length;i++) {
                if(arr[i+1] <= arr[i]) {
                    return arr[i+1];
                }
            }
            return -1;
        }

        //swapping alternate elements in an array:
        static int[] getAlternateSwappedArray(int arr[]) {
            int size = arr.length;
           // int newArr[] = new int [size];
            for ( int i=0; i<size; i=i+2) {
                int temp;
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;                
            }
            return arr;
        }
        static void main() {

            //int[] arr = {1,23,4,5,67};
            //System.out.println( getAverage(arr));

            // int[] arr = {1,2,3,4,5};
            // int ans[] = multiplyby10(arr);
            // for (int i : ans) {
            //     System.out.println(i);
            // }

            // int arr[] = {10,7,3,90,56};
            // int n = 90;      
            // boolean ans = linearSearch(n, arr) ;
            // System.out.println(ans);

            // int arr[] = {10,7,3,90,56};
            // int ans = maxElement(arr);
            // System.out.println("Max: "+ans);

            // int arr[] = {12,0,-34,90,-98};
            // int ans[] = sumOfPosNeg(arr);
            // System.out.println("Positive sum: "+ ans[0]);
            // System.out.println("Negative sum: "+ ans[1]);

            // int arr[] = {1,2,3,4,1,1,1,0,0,0};
            // int ans[] = countZeroesOnes(arr);
            // System.out.println("Zero count: "+ans[0]);
            // System.out.println("One count: "+ans[1]);

            //int arr[] = {1,2,5,4,9};
            //System.out.println(getUnsortedElement(arr));
        
            int arr[] = {1,2,3,4,5,6};
            int ans[] = getAlternateSwappedArray(arr);
             for ( int i : ans) {
                System.out.println(i);
            }

        }
}
