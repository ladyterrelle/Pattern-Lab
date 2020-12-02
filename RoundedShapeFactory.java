package factory;

public class RoundedShapeFactory extends AbstractFactory {

	public Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("Circle")) {
			return new RoundedCircle();
		} else if (shapeType.equalsIgnoreCase("Square")) {
			return new RoundedSquare();
		} else if (shapeType.equalsIgnoreCase("Rectangle")) {
			return new RoundedRectangle();
		}
		return null;
	}
	
}
