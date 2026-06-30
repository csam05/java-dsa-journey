
import java.util.HashMap;

public class FindFirstRepeatingElement {

    static int findFirstRepeatingElement(int[] arr) {
        HashMap <Integer,Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        for (int i:arr) {
            if(freq.get(i)>1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,3,2,2,3,3};
        int ans = findFirstRepeatingElement(arr);
        System.out.println(ans);
    }
}
