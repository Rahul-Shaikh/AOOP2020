class Student extends Person {
  long roll;
  String course;

  @Override
  void setValues() {
    System.out.println("");
    System.out.print("ENTER NAME: ");
    name = psc.nextLine();
    System.out.print("ENTER ROLL: ");
    roll = psc.nextLong();
    psc.nextLine();
    System.out.print("ENTER COURSE: ");
    course = psc.nextLine();
    System.out.print("ENTER EMAIL: ");
    emailId = psc.nextLine();
    System.out.print("ENTER PHONE NUMBER: ");
    phNo = psc.nextLine();
    add = new Address();
  }

  @Override
  void show() {
    System.out.println("\n--------------------------------------------");
    System.out.println("ROLL: " + String.format("%012d", roll));
    System.out.println("NAME: " + name);
    System.out.println("COURSE: " + course);
    System.out.println("PHONE NUMBER: " + phNo);
    System.out.println("EMAIL ID: " + emailId);
    System.out.println("ADDRESS: " + add);
    System.out.println("--------------------------------------------\n");
  }
}