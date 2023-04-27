package com.ncc.generic;

public class Book3<K, V, I> extends GenericExample<K, V> {
    private I info; //khởi tạo thêm tham số generic

    public Book3(K key, V value) {
        super(key, value);
    }

    public Book3(K key, V value, I info) {
        super(key, value);
        this.info = info; //truyển kiểu generic mới vào
    }

    public I getInfo() {
        return info;
    }

    public void setInfo(I info) {
        this.info = info;
    }
}
