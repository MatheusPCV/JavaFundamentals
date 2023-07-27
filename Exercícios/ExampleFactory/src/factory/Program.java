package factory;

public class Program {

	public static void main(String[] args) {
		TurnMachine cnc = new TurnMachine(1);
		cnc.setDescription("Enco");
		cnc.setPotency("1000V");
		
		System.out.println(cnc.getFullDescription());
		
		Computer pc = new Computer(2);
		pc.setDescription("Dell");
		pc.setModel("Optiplex");
		
		System.out.println(pc.getFullDescription());
	

	}

}
