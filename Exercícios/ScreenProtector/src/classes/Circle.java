package classes;

import java.awt.*;


public class Circle extends Elipse{

	public Circle(Color color, int posX, int posY, int size) {
		super(color, posX, posY, size, size);
	}
	
	@Override
	public void setWidth(int size) {
		super.setWidth(size);
		super.setHeight(size);
	}
	
	@Override
	public void setHeight(int size) {
		super.setWidth(size);
		super.setHeight(size);
	}

}
