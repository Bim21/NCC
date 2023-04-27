package com.ncc.generic.genericInterface;

public interface writer<T> {
    void delete(T obj);
    void update(T obj);
    void writer(T obj);
}
