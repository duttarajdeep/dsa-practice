package system.design.lld.designPatterns.DecoratorPattern.Toppings;

import system.design.lld.designPatterns.DecoratorPattern.Pizza.BasePizza;

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
