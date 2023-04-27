package com.ncc.generic.genericInterface;

public class Book<T> implements writer<T>{
    @Override
    public void delete(T obj) {

    }

    @Override
    public void update(T obj) {

    }

    @Override
    public void writer(T obj) {
        System.out.println("ab");
    }
}
