package edu.cmu.cs214.DecoratorPattern;

public class LightRoastWithSoyMilk extends Coffee {

    private String description;

    public LightRoastWithSoyMilk() {
        this.description = "Light roast coffee with soy milk";
    }

    @Override
    public double getCost() {
        return 8.5;
    }

    public String getDescription() {
        return description;
    }
}
