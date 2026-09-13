package Arrays;

public class Revers {
    //Solution 1 (this is clean but not the best because the time complexity O(n^2) Space complexity O(n))
    public static String Revers2(String str){
        if(str.length() < 2){
            return str;
        }
        String strAfter = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            strAfter += str.charAt(i);
        }
        return strAfter;
    }
    //Solution 2 (this Great in time complexity than the another one O(n))
    public static String Revers(String str){
        if(str.length() < 2){
            System.out.println("this cant be Revers String");
        }
        char [] strAsString = str.toCharArray();

        int Left = 0;
        int Right = strAsString.length -1;

        while(Left < Right){
            char temp = strAsString[Left];
            strAsString[Left] = strAsString[Right];
            strAsString[Right] = temp;

            Left++;
            Right--;
        }
        return new String(strAsString);
    }

    static void main(String[] args) {
        System.out.println(Revers2("Hi My name is Walid Ahmed Ismail"));
    }
}
