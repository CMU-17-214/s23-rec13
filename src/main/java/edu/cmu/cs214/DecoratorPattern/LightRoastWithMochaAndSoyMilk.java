package edu.cmu.cs214.DecoratorPattern;

public class LightRoastWithMochaAndSoyMilk extends Coffee{

    private String description;

    public LightRoastWithMochaAndSoyMilk() {
        this.description = "Light roast coffee with mocha and soy milk";
    }

    @Override
    public double getCost() {
        return 11.5;
    }

    public String getDescription() {
        return description;
    }
}
