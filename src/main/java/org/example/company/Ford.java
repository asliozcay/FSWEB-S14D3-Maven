package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + ": Ford engine starting");
        return getName() + " engine starting";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName() + ": Ford accelerating");
        return getName() + " accelerating";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName() + ": Ford braking");
        return getName() + " braking";
    }
}
