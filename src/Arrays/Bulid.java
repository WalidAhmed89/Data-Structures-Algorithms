package Arrays;

import Arrays.bulidFormScratch.MyArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Bulid {
    static void main(String[] args) {
//        //Static Array
//        int[] nums = new int[20];
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = i;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//        Stack<Integer> nums2 = new Stack<>();
//
//
//
//        //Dynamic Array
//        ArrayList<String> Strings = new ArrayList<>(List.of("a","b","c","d"));
//        Strings.add("e");
//        Strings.remove("b");
//        Strings.addFirst("aa");
//        //Splice
//        Strings.add(3,"oo");
//        System.out.println(Strings);

        //My new Array i build
        MyArray newArray = new MyArray();
        newArray.push(1);
        newArray.push(2);
        newArray.push(3);
        newArray.push(4);
        newArray.push(5);
        System.out.println(newArray.pop());
        System.out.println(newArray.Delete(1));
        System.out.println(newArray.getIndex(2));
    }
}
