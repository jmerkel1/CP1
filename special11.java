public class special11 {
	public static void main(String[] args) {
		System.out.println(specialEleven(22));
		System.out.println(specialEleven(23));
		System.out.println(specialEleven(24));
	}

	public static boolean specialEleven(int n) {
		if (n % 11 == 0) {
			return true;
		} else if (n % 11 == 1) {
			return true;
		} else {
			return false;
		}
	}
}
