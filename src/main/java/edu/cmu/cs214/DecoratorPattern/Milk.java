package edu.cmu.cs214.DecoratorPattern;

class Milk extends CondimentDecorator {

    private Coffee coffee;

    Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 2.0D;
    }
}
