package Interview;

public class solution {

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        String str = String.valueOf(x);

        char[] original = str.toCharArray();
        char[] reversed = new char[original.length];

        int index = 0;

        for (int i = original.length - 1; i >= 0; i--) {
            reversed[index++] = original[i];
        }

        return Integer.parseInt(new String(reversed)) == x;
    }
}
