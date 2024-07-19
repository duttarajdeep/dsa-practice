package lowLevelDesign.designPatterns.DecoratorPattern;

import lowLevelDesign.designPatterns.DecoratorPattern.Pizza.BasePizza;
import lowLevelDesign.designPatterns.DecoratorPattern.Pizza.Margherita;
import lowLevelDesign.designPatterns.DecoratorPattern.Pizza.VegDelight;
import lowLevelDesign.designPatterns.DecoratorPattern.Toppings.ExtraCheese;
import lowLevelDesign.designPatterns.DecoratorPattern.Toppings.ExtraVeggies;

public class Order {
    public static void main(String[] args) {

        // Margherita + extra cheese
        BasePizza pizza = new ExtraCheese(new Margherita());
        System.out.println(pizza.cost());

        // veg delight + extra cheese + extra veggies
        BasePizza pizza2 = new ExtraVeggies(new ExtraCheese(new VegDelight()));
        System.out.println(pizza2.cost());

    }
}
