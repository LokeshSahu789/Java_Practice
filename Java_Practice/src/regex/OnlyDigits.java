package regex;

public class OnlyDigits {
	public static void main(String[] args) {
		String str = "DEMO98 TE4567XT";
		System.out.println("String = " + str);
		System.out.println("Displaying digits: " + str.replaceAll("\\D", ""));
		System.out.println("Displaying digits: " + str.replaceAll("[^0-9]", ""));
		
		System.out.println("Displaying without digits: " + str.replaceAll("\\d", ""));
		
		
	}
}
