package core2.collections.sandbox;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("mama", "amam"));
    }

    private static boolean isAnagram(String str, String str2 ) {

      Arrays.sort(str.toCharArray());
      Arrays.sort(str2.toCharArray());
      return  str.equals(str2);

    }
}
