package Lab3.Problem3;

import java.util.Iterator;

public interface MyCollection<E> extends Iterable<E> {
    boolean add(E element);
    boolean remove(E element);
    boolean contains(E element);
    int size();
    boolean isEmpty();
    void clear();
    Object[] toArray();
}