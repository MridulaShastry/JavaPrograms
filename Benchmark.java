class Benchmark {
	
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		long endTime = startTime + 60000;
		long index = 0;
		// System.out.println("Current time:" + startTime);
		while(true) {

			double x = Math.sqrt(index);
			long now = System.currentTimeMillis();
			// System.out.println(" now" + now);
			if (now > endTime)
			{
				break;
			}
			index++;
		}
		System.out.println(index + " loops in one minute. ");
	}
}