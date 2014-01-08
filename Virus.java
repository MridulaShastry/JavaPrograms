public class Virus {
	
	static int virusCount = 0;

	public Virus() {
		virusCount++;
	}

	public static int getVirusCount() {
		return virusCount;
	}
}