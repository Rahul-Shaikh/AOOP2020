import java.util.Scanner;

class StudentClass {
	int roll;
	String name;
	float score;
	
	StudentClass() {
		name = "NOT ASSIGNED";
		roll = -1;
		score = -1.0F;
	}
	
	StudentClass(int roll) {
		this.roll = roll;
		name = "NOT ASSIGNED";
		score = -1.0F;
	}
	
	StudentClass(int roll, String name) {
		this.roll = roll;
		this.name = name;
		score = -1.0F;
				
	}
	
	StudentClass(int roll, String name, float score) {
		this.name = name;
		this.roll = roll;
		this.score = score;
	}
	
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
    
    StudentClass(StudentClass st) {
    	this.name = new String(st.name);
    	this.roll = st.roll;
    	this.score = st.score;
    }
    
}

class Student2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentClass st1 = new StudentClass();
		StudentClass st2 = new StudentClass(1, "NONE1", 80.0F);
		StudentClass st3 = new StudentClass(2, "NONE2");
		StudentClass st4 = new StudentClass(3);
		
		StudentClass st2cpy = new StudentClass(st2);
		st1.showValues();
		st2.showValues();
		st3.showValues();
		st4.showValues();
		
		System.out.println("\n\nChanging the name in Copy object\n");
		st2cpy.setValues(4, "NONE3", 90.0F);
		st2cpy.showValues();
		st2.showValues();
				
	}
}


