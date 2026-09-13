package Interview;

import java.util.HashMap;
import java.util.Map;

public class Interview {
    static void main(String[] args) {
        //this was the arrays we need to check if is matching characters
        char[] chart1 = {'a','b','x','t'};
        char[] chart2 = {'y','s','i','p'};
        System.out.println(matchingCahrts2(chart1, chart2));

    }
    public static boolean matchingCahrts(char[] arr1,char[]arr2){
        //this solution is not the best solution because in time complexity is O(n^2)
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean matchingCahrts2(char[] arr1,char[] arr2){
        Map<Character,Boolean> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i],true);
        }
        for (int j = 0; j < arr2.length; j++) {
            if(map.get(arr2[j])){
                return true;
            }
        }
        return false;
    }
}
