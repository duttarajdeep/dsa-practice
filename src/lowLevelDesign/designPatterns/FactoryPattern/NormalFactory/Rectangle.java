package lowLevelDesign.designPatterns.FactoryPattern.NormalFactory;

public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
