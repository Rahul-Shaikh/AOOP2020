import java.util.Scanner;

class StudentClass {
	int roll;
	String name;
	float score;
	
	void setValues(int roll, String name, float score)
	{
		this.name = name;
		this.roll = roll;
		this.score = score;	
    }
    
    void showValues()
    {
    	System.out.println("--------------------------------------------------------------");
    	System.out.println("NAME: " + name);
    	System.out.println("ROLL: " + roll);
    	System.out.println("SCORE: " + score);
    	System.out.println("--------------------------------------------------------------");
    }
    
    void copy(StudentClass st)
    {
    	st.name = new String(name);
    	st.roll = roll;
    	st.score = score;
    }
    
}

class Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int roll;
		float score;
		System.out.print("Enter name, roll, score: ");
		name = sc.nextLine();
		roll = sc.nextInt();
		score = sc.nextFloat();
		StudentClass st1 = new StudentClass();
		st1.setValues(roll, name, score);
		st1.showValues();
		
		StudentClass st2 = new StudentClass();
		st1.copy(st2);
		st2.setValues(roll, "CHANGED", score);
		System.out.println("\n\nCHANGED THE VALUE OF COPY OBJECT\n");
		st2.showValues();
		st1.showValues(); 
	}
}

