package lld.designPatterns.DecoratorPattern;

import lld.designPatterns.DecoratorPattern.Pizza.BasePizza;
import lld.designPatterns.DecoratorPattern.Pizza.Margherita;
import lld.designPatterns.DecoratorPattern.Pizza.VegDelight;
import lld.designPatterns.DecoratorPattern.Toppings.ExtraCheese;
import lld.designPatterns.DecoratorPattern.Toppings.ExtraVeggies;

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
