package edu.cmu.cs214.DecoratorPattern;

public class LightRoast extends Coffee{

    private String description;

    public LightRoast () {
        this.description = "Light Roast";
    }

    @Override
    public double getCost() {
        return 6.0;
    }

    public String getDescription() {
        return description;
    }
}
