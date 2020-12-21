package december24;

public class Q10 {

	public static void main(String[] args) {
		System.out.println(test(null));
	}

	private static String test(Object object) {
		try {
			return object.toString();
		} catch (Exception e) {
			return "A";
		} finally {
			return "B";
		}
	}
}
