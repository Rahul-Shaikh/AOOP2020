class Main {
	public static void main(String args[]) {
		String val = "The string and character array are almost same. In java String is an object and character array is @rray of characters.";
	
		if (val.indexOf("The") == 0) System.out.println("The String starts with The"); // starts with The or not
		
		int count = 0;
		for (int i = 0; i < val.length(); i++) {
			if (val.charAt(i) == 'a') count++;
		}
		
		System.out.println("The number of a is " + count); // number of a
		
		count = 0;
		int i = 0;
		while (i < val.length()) {
			int flag = val.indexOf("and",i);
			i = flag;
			if (flag == -1) break;
			if (flag != -1) count++;
			i++;
		}
		System.out.println("The number of and is " + count); // number of and
		
		char arr[] = val.toCharArray();
		for (char a: arr) System.out.print(a + ", "); // char array
		System.out.println("\n");
		
		String tokens[] = val.split("[ .@]+");
		for (String a: tokens) System.out.print(a + ", "); // tokens
		System.out.println("\n");
	}
}
