package lowLevelDesign.designPatterns.FactoryPattern.NormalFactory;

public class ShapeFactory {
    public Shape getShape(String type){
        switch (type){
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
        }
        return null;
    }
}
