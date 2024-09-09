package lld.designPatterns.FactoryPattern.NormalFactory;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
