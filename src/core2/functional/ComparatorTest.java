package core2.functional;

import java.util.Comparator;

public class ComparatorTest {

    public static void main(String[] args) {
        Comparator<Integer> integerComparator = (o1,  o2) -> Integer.compare(o1, o2);
        System.out.println(integerComparator.compare(1, 2));
    }

    private static class IntegerComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return Integer.compare(o1, o2);
        }
    }
}
