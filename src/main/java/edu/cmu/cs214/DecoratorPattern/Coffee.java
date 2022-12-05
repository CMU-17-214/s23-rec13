package edu.cmu.cs214.DecoratorPattern;

public abstract class Coffee {

    private String description;

    public Coffee () {
        this.description = "Sample Coffee";
    }

    public abstract double getCost();
}
