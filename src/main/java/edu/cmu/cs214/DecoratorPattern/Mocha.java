package edu.cmu.cs214.DecoratorPattern;

public class Mocha extends CondimentDecorator {

    private Coffee coffee;

    Mocha(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Mocha";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 3.0D;
    }
}