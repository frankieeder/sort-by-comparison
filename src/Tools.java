import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Tools {
    public static <T> Iterable<Deque<T>> splitList(Deque<T> l, int i) {
        Deque<T> one= new ArrayList<>(l);
        Deque<T> sub = one.subList(0, i);
        Deque<T> two = new ArrayList<T>(sub);
        sub.clear();
        Deque<Deque<T>> result = new ArrayList<Deque<T>>();
        result.add(one);
        result.add(two);
        return result;
    }
    public static <T> Iterable<Deque<T>> splitList(Deque<T> l) {
        splitList(l, (l.size() / 2));
    }
}
