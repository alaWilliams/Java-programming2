import java.time.Year;

public class Person {

	private static final int DEFAULT_YEAR = 1950;

	private static int count;
	
	private String name = "No name";
	private int bYear = DEFAULT_YEAR;
	
	public Person() {
		count++;
	}
	
	public Person(String name, int bYear) {
		this();
		setName(name);
		setbYear(bYear);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && !name.isEmpty())
			this.name = name;
	}

	public int getbYear() {
		return bYear;
	}

	public void setbYear(int bYear) {
		if (bYear > DEFAULT_YEAR && bYear <= Year.now().getValue())
			this.bYear = bYear;
	}

	public static int getDefaultYear() {
    return DEFAULT_YEAR;
}


	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		int age = Year.now().getValue() - bYear;
		return "Person: \"" + name + "\", bYear=" + bYear + " (" + age + ")";
	}
}
