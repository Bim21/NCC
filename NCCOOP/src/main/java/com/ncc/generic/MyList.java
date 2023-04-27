package com.ncc.generic;

public interface MyList<E> extends Iterable<E>{
    void add(E e);
    E get(int index);
    int size();
}
