package lowLevelDesign.designPatterns.DecoratorPattern.Toppings;

import lowLevelDesign.designPatterns.DecoratorPattern.Pizza.BasePizza;

public class ExtraVeggies extends ToppingDecorator {

    BasePizza pizza;

    public ExtraVeggies(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 30;
    }
}
