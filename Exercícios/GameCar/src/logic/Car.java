package logic;

public class Car {
	//Atributos
	private String color;
	private int speed;
	private int posX;
	private int posY;
	private int health;
	
	
	//Construtores
	public Car () {
		
	}
	
	public Car (String color) {
		this.color = color;
	}
	
	public Car (String color, int posX, int posY) {
		this.color = color;
		this.posX = posX;
		this.posY = posY;
	}
	
	public Car (String color, int speed, int posX, int posY, int health) {
		this.color = color;
		this.speed = speed;
		this.posX = posX;
		this.posY = posY;
		this.health = health;
	}
	
	//Métodos Funcionais
	public void accelerate () {
		this.speed += 1;
	}
	
	//Métodos de Acesso
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", posX=" + posX + ", posY=" + posY + ", health=" + health
				+ "]";
	}
}
