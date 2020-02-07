import java.util.Scanner;


class ScoreException extends Exception {
	float value;
	
	ScoreException(float u) { value = u; }
	
	@Override
	public String toString() {
		return value + " is not between 0 and 100.";
	}
}


class Student {
	String name;
	long roll;
	float score;
	private static Scanner psc = new Scanner(System.in);
	
	Student() {
		System.out.print("ENTER NAME: ");
		name = psc.nextLine();
		System.out.print("ENTER ROLL: ");
		roll = psc.nextLong();
		System.out.print("ENTER SCORE: ");
		try {
			score = psc.nextFloat();
			psc.nextLine();
			if (score > 100 || score < 0) throw new ScoreException(score);
		}
		catch(ScoreException e) {
			System.out.println(e);
		}
	}
	
	void setScore() {
		System.out.print("ENTER SCORE: ");
		try {
			score = psc.nextFloat();
			psc.nextLine();
			if (score > 100 || score < 0) throw new ScoreException(score);
		}
		catch(ScoreException e) {
			System.out.println(e);
		}	
	}
}

class Main {
	public static void main(String[] args) {
		Student st = new Student();
		st.setScore();
	}
	
}



