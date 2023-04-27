package com.ncc.generic;

public class MyArrayGeneric<T> {
    private T[] arr;

    public MyArrayGeneric(T[] arr) {
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }

    public T getFirstElement() {
        if (this.arr.length == 0) {
            return null;
        }
        return this.arr[0];
    }

    public T getLastElement() {
        if(this.arr.length == 0){
            return null;
        }
        return this.arr[this.arr.length-1];
    }
}
