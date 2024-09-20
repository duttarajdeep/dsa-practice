package system.design.lld.designPatterns.DecoratorPattern;

import system.design.lld.designPatterns.DecoratorPattern.Pizza.BasePizza;
import system.design.lld.designPatterns.DecoratorPattern.Pizza.Margherita;
import system.design.lld.designPatterns.DecoratorPattern.Pizza.VegDelight;
import system.design.lld.designPatterns.DecoratorPattern.Toppings.ExtraCheese;
import system.design.lld.designPatterns.DecoratorPattern.Toppings.ExtraVeggies;

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
