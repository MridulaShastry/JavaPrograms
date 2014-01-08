public class ModemTester {
	
	public static void main(String args[]) {

		CableModem surfBoard = new CableModem();
		DslModem gateway = new DslModem();
		surfBoard.speed = 500000;
		gateway.speed = 400000;
		System.out.println("Trying Cable Modem: ");
		surfBoard.displaySpeed();
		surfBoard.connect();
		System.out.println("Trying DSL phone connection: ");
		gateway.displaySpeed();
		gateway.connect();

	}
}