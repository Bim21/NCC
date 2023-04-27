package com.ncc.generic.genericWildcard;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    // drawShapes chỉ chấp nhận các kiểu thuộc lớp Shape hoặc con của nó
    public static void drawShapes(List<? extends Shape> lists){
        for (Shape s: lists){
            s.draw();
        }
    }

    public static void main(String[] args) {
        List<Square> list1 = new ArrayList<Square>();
        list1.add(new Square());

        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());
        list2.add(new Circle());

        drawShapes(list1);
        drawShapes(list2);
    }
}
