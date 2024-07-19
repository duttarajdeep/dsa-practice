package lowLevelDesign.designPatterns.DecoratorPattern.Toppings;

import lowLevelDesign.designPatterns.DecoratorPattern.Pizza.BasePizza;

public class ExtraCheese extends ToppingDecorator {

    BasePizza pizza;

    public ExtraCheese(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 20;
    }
}
