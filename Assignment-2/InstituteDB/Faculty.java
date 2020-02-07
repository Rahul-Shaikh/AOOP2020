class Faculty extends Person {
  long empId;
  String dept;
  String splsation;

  @Override
  void show() {
    System.out.println("\n--------------------------------------------");
    System.out.println("EMPLOYEE ID: " + String.format("%012d", empId));
    System.out.println("NAME: " + name);
    System.out.println("DEPARTMENT: " + dept);
    System.out.println("SPECIALISATION: " + splsation);
    System.out.println("PHONE NUMBER: " + phNo);
    System.out.println("EMAIL ID: " + emailId);
    System.out.println("ADDRESS: " + add);
    System.out.println("--------------------------------------------\n");
  }

  @Override
  void setValues() {
    System.out.println("");
    System.out.print("ENTER NAME: ");
    name = psc.nextLine();
    System.out.print("ENTER EMPLOYEE ID: ");
    empId = psc.nextLong();
    psc.nextLine();
    System.out.print("ENTER DEPARTMENT: ");
    dept = psc.nextLine();
    System.out.print("ENTER SPECIALISATION: ");
    splsation = psc.nextLine();
    System.out.print("ENTER EMAIL: ");
    emailId = psc.nextLine();
    System.out.print("ENTER PHONE NUMBER: ");
    phNo = psc.nextLine();
    add = new Address();
  }
}