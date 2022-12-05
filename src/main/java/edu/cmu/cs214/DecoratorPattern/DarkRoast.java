package edu.cmu.cs214.DecoratorPattern;

public class DarkRoast extends Coffee{

    private String description;

    public DarkRoast () {
        this.description = "Dark Roast";
    }

    @Override
    public double getCost() {
        return 7.0;
    }

    public String getDescription() {
        return description;
    }
}
