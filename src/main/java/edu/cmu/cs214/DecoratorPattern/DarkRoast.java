package edu.cmu.cs214.DecoratorPattern;

public class DarkRoast extends Coffee{

    public DarkRoast () {
        this.description = "Dark Roast";
    }

    @Override
    public double getCost() {
        return 7.0;
    }
}
