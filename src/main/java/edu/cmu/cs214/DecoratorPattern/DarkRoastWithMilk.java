package edu.cmu.cs214.DecoratorPattern;

public class DarkRoastWithMilk extends Coffee{

    private String description;

    public DarkRoastWithMilk() {
        this.description = "Dark Roast coffee with milk";
    }

    @Override
    public double getCost() {
        return 9.0;
    }

    public String getDescription() {
        return description;
    }
}
