import java.util.ArrayDeque;
import java.util.Deque;

public class MergeSortByComparison {
    public static <T> Deque<T> sortByComparison(T[] l) {
        return sortingHelper(l, 0, l.length);
    }

    public static <T> Deque<T> sortingHelper(T[] l, int s, int e) {
        if (e - s == 1) {
            Deque<T> r = new ArrayDeque<>();
            r.addLast(l[s]);
            return r;
        }
        Deque<T> left = sortingHelper(l, s, (s + e) / 2);
        Deque<T> right = sortingHelper(l, (s + e) / 2, e);
        Deque<T> sorted = new ArrayDeque<>();
        while (!left.isEmpty() || !right.isEmpty()) {
            if (left.isEmpty()) {
                sorted.addLast(right.removeFirst());
            } else if (right.isEmpty()) {
                sorted.addLast(left.removeFirst());
            } else if (Tools.compare(left.peekFirst(), right.peekFirst())) {
                sorted.addLast(left.removeFirst());
            } else {
                sorted.addLast(right.removeFirst());
            }
        }
        return sorted;

    }

    public static void main(String[] args) {
        String[] strings = new String[]{"cat", "fence", "the", "jumped", "over", "that"};
        Deque<String> result = sortByComparison(strings);
        System.out.println(result);
    }
}