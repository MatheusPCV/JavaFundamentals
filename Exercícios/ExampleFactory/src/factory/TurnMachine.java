package factory;

public class TurnMachine extends Equipments {
	
	private String potency;

	public TurnMachine(int idEquipaments) {
		super(idEquipaments);
		
	}

	public String getPotency() {
		return potency;
	}

	public void setPotency(String potency) {
		this.potency = potency;
	}
	
	public String getFullDescription() {
		return super.getFullDescription() + " - " + getPotency();
	}
}
