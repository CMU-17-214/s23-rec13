package edu.cmu.cs214.DecoratorPattern;

public class SoyMilk extends CondimentDecorator {

    private Coffee coffee;

    SoyMilk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Soy Milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 2.5D;
    }
}