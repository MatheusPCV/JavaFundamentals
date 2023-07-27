package factory;

public class Computer extends Equipments {
	
	private String model;

	public Computer(int idEquipaments) {
		
		super(idEquipaments);
		// TODO Auto-generated constructor stub
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFullDescription() {
		return super.getFullDescription() + " - " + getModel();
	}
}
