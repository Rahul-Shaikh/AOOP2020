class CLI {
	public static void main(String[] args) {
		System.out.println("The number of parameters " + args.length);
		System.out.println("The parameters are: ");
		for (String v: args) {
			System.out.println(v);
		}

	}
}
