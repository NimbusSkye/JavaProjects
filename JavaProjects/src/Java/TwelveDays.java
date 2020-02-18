package Java;

public class TwelveDays {
	public static void main(String[] args) {
	    String[] DAYS = {"first", "second", "third", "fourth",
							"fifth", "sixth", "seventh", "eighth",
							"ninth", "tenth", "eleventh", "twelfth"};
	String[] GIFTS = {
			"a partridge in a pear tree",
			"two turtle doves",
			"three French Hens",
			"four Calling Birds",
			"five Golden Rings",
			"six Geese a Laying",
			"seven Swans a Swimming",
			"eight Maids a Milking",
			"nine Ladies Dancing",
			"ten Lords a Leaping",
			"eleven Pipers Piping",
			"twelve Drummers Drumming"
	};
	if (args.length==0) {
		for (int i=0; i<DAYS.length; i++) 
			System.out.println("On the "+DAYS[i]+" day my true love gave to me a "+GIFTS[i]+".");
		}
	else {
		for (int i=0; i<DAYS.length; i++) 
			System.out.println("On the "+(i+1)+"th day my true love gave to me a "+GIFTS[i]+".");
	}
}
}