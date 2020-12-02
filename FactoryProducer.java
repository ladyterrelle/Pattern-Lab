package factory;

public class FactoryProducer {
	public static AbstractFactory getFactory(boolean roundedShape) {
		if (roundedShape) {
			return new RoundedShapeFactory();
		}
		else {
		return new ShapeFactory();	
		}
	}
 
}
