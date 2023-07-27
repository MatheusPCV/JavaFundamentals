package factory;

public class Equipments implements IEquipments {
	
	private int idEquipment;
	private String description;
	
	public Equipments(int idEquipaments) {
		this.idEquipment = idEquipment;
	}
	
	@Override
	public String getFullDescription() {
		return idEquipment + " - " + description;
	}

	public int getIdEquipment() {
		return idEquipment;
	}

	public void setIdEquipment(int idEquipment) {
		this.idEquipment = idEquipment;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
