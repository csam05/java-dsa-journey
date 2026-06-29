import java.util.HashMap;

public class GetModeOfArray {

    static int getModeOfArray(int[] arr) {

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num : arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        int maxFreq = 0;
        int mode = 0;

        for(int key : freq.keySet()){

            if(freq.get(key) > maxFreq){
                maxFreq = freq.get(key);
                mode = key;
            }
        }

        return mode;
    }


    public static void main(String[] args){

        int arr[] = {1,2,2,3,3,3,4,4,5,5,5,5,6,6,6,7};

        System.out.println(getModeOfArray(arr));
    }
}