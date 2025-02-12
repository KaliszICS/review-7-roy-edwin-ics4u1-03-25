public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static String evenOrOdd(int int1) {
		if (int1%2==0) {
			return ("Even");
		}
		else {
			return ("Odd");
		}
	}
	
	public static String teacherOrStudent(String teacher) {
		if (teacher == "Kalisz") {
			return ("Teacher");
		}
		else {
			return ("Student");
		}
	}
	public static int fartherFromZero(int zero) {
		if (zero>0 || zero<0) {
			if (zero>0) {
				return (zero+5);
		}
		else {
			return (zero-5);
		}
	}
		else {
			return (0);
		}
	}

	public static String isFive(int fivey) {
		if (fivey == 5){
			return ("The number is Five");
		}
		else {
			return ("The number is not Five");
		}
	}

	public static String positiveOrNegative(double num1) {
		if (num1>0) {
			return ("Positive");
		}
		else {
			return ("Negative");
		}
	}

	public static String highOrLow(int num2) {
		if (num2>100){
			return ("High");
		}
		else {
			return ("Low");
		}
	}

	public static String isHello(String hi) {
		if (hi=="Hello") {
			return ("The word is Hello");
		}
		else {
			return ("The word is not Hello");
		}
	}
}

