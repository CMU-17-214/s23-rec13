package edu.cmu.cs214.DecoratorPattern;

public class LightRoast extends Coffee{

    public LightRoast () {
        this.description = "Light Roast";
    }

    @Override
    public double getCost() {
        return 6.0;
    }
}
