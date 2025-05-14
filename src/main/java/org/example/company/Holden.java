package org.example.company;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + ": Holden engine starting");
        return  getName() + " engine starting";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName() + ": Holden accelerating");
        return  getName() + " accelerating";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName() + ": Holden braking");
        return  getName() + " braking";
    }
}
