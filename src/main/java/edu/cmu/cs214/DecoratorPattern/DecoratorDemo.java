package edu.cmu.cs214.DecoratorPattern;

/**
 * The class that uses Coffee Shop as an example to show the correctness
 * of the class implemented in Decorator folder.
 *
 * @author Eshita Agarwal
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        // create coffee types
        LightRoast lightRoast = new LightRoast();
        DarkRoastWithMilk darkRoastWithMilk = new DarkRoastWithMilk();
        LightRoastWithMochaAndSoyMilk lightRoastWithMochaAndSoyMilk = new LightRoastWithMochaAndSoyMilk();
        System.out.println(lightRoast.getDescription() + " costs " + lightRoast.getCost());
        System.out.println(darkRoastWithMilk.getDescription() + " costs " + darkRoastWithMilk.getCost());
        System.out.println(lightRoastWithMochaAndSoyMilk.getDescription() + " costs " + lightRoastWithMochaAndSoyMilk.getCost());
    }
}
