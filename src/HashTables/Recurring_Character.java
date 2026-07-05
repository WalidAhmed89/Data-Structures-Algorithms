package HashTables;

import java.util.Hashtable;

public class Recurring_Character {
    public static int recurring(int[] nums) {

        Hashtable<Integer, Boolean> seen = new Hashtable<>();

        for (int num : nums) {

            if (seen.containsKey(num)) {
                return num;
            }

            seen.put(num, true);
        }

        return -1;
    }
}
