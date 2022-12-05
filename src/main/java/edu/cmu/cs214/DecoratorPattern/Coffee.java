package edu.cmu.cs214.DecoratorPattern;

public abstract class Coffee {

    String description = "Sample Coffee";

    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}
