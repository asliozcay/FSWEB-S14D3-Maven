package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + ": Mitsubishi engine starting");
        return getName() + " engine starting";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName() + ": Mitsubishi accelerating");
        return getName() + " accelerating";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName() + ": Mitsubishi braking");
        return getName() + " braking";
    }
}
