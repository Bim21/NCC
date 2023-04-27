package com.ncc.abstractclass;

public abstract class Car extends Vehicle {
    public Car() {
        setWheelAmount(4);
    }

    public abstract void napNhienLieu();

    @Override
    public void di() {
        System.out.println("Di bang 4 banh");
    }
}
