package com.ncc.generic;

import java.util.ArrayList;

public class Store {
    public static <E> E getFirstElement(ArrayList<E> arr){
        if(arr.isEmpty())
            return null;
        E first = arr.get(0);
        return first;
    }
}
