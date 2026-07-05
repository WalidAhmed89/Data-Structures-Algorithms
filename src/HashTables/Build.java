package HashTables;

import java.util.Hashtable;

import static HashTables.Recurring_Character.recurring;

public class Build {
    static void main(String[] args) {
//        Hashtable<String,Object> user = new Hashtable<>();
//        user.put("Name","Walid");
//        user.put("Age",19);
//        user.put("Magic",true);
//        user.put("Scream","Ahhhhhhhhhhh!");
//        System.out.println(user.get("Magic"));
//
//        HashTable hash = new HashTable(5);
//
//        hash.set("Walid",19);
//        hash.set("Frosted",22);
//        hash.set("Ail",19);
//        hash.set("Ahmed",55);
//        hash.set("Omar",31);
//        hash.set("Ekramy",19);
//        hash.set("ww",22);
//        System.out.println(hash.get("ww"));
//
//       hash.keys();

        int [] nums = {2,5,1,2,3,5,1,2,4};

        System.out.println(recurring(nums));
    }
}
