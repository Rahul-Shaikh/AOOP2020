// import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);

		Student st = new Student();
		st.setValues();
		st.show();

		// Faculty ft = new Faculty();
		// ft.setValues();
		// ft.show();

		st.changeAddress();
		st.show();
	}
}
