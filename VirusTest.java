public class VirusTest {
	
	public static void main(String[] args) {

		int numViruses = Integer.parseInt(args[0]);

		if (numViruses > 0) {

			Virus[] virii = new Virus[numViruses];

			for (int i = 0; i < numViruses; i++) {
				
				virii[i] = new Virus();
			}

			System.out.println("Number of Viruses " + Virus.getVirusCount());
		}
	}
}