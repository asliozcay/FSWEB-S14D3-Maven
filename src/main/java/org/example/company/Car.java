package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String startEngine(){
        System.out.println(getClass().getSimpleName() + ": the car's engine is starting");
        return "the car's engine is starting";
    }

    public String accelerate(){
        System.out.println(getClass().getSimpleName() + ": the car is accelerating");
        return "the car is accelerating";
    }

    public String brake(){
        System.out.println(getClass().getSimpleName() + ": the car is braking");
        return "the car is braking";
    }
}
