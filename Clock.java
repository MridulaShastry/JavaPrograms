import java.util.*;

class Clock {

	public static void main(String args[]) {

		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int year = now.get(Calendar.YEAR);

		// Display greeting
		if (hour < 12)
		{
			System.out.println("Good Morning.\n");
		}
		else if (hour < 17)
		{
			System.out.println("Good Afternoon.\n");
		}
		else
		{
			System.out.println("Good Evening.\n");
		}

		// Begin time message by showing minutes first
		System.out.print("It's");
		if (minute != 0)
		{
			System.out.print(" " + minute + " ");
			System.out.print((minute != 1) ? "minutes" : "minute");
			System.out.print(" past");
		}

		System.out.print(" ");
		System.out.print((hour > 12) ? (hour - 1) : hour);
		System.out.print(" \'o clock on ");

		//display the month

		switch(month) {

			case 1: 
				System.out.print("January");
				break;

			case 2: 
				System.out.print("February");
				break;

			case 3: 
				System.out.print("March");
				break;

			case 4:
				System.out.print("April");
				break;

			case 5:
				System.out.print("May");
				break;

			case 6:
				System.out.print("June");
				break;

			case 7:
				System.out.print("July");
				break;

			case 8:
				System.out.print("August");
				break;

			case 9:
				System.out.print("September");
				break;

			case 10:
				System.out.print("October");
				break;

			case 11: 
				System.out.print("November");
				break;

			case 12: 
				System.out.print("December");
				break;
		}

		System.out.println(" " + day + "th " + year + ".");



	}
}