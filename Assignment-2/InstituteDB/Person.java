import java.util.Scanner;

abstract class Person {
  String name;
  Address add;
  String phNo;
  String emailId;
  protected static Scanner psc = new Scanner(System.in);
  
  abstract void show();
  abstract void setValues();

  void changeAddress() {
    do {
      System.out.println("");
      System.out.println("ENTER 'PN' TO CHANGE PREMISES NUMBER");
      System.out.println("ENTER 'ST' TO CHANGE STREET NAME");
      System.out.println("ENTER 'CT' TO CHANGE CITY NAME");
      System.out.println("ENTER 'STT' TO CHANGE STATE NAME");
      System.out.println("ENTER 'PIN' TO CHANGE PIN NUMBER");
      System.out.println("ENTER 'ALL' TO CHANGE EVERYTHING");
      System.out.println("ENTER 'Q' TO QUIT");
  
      System.out.println("\nENTER CHOICE: ");
      String choice = psc.nextLine();

      if (choice.equals("PN")) {
        add.changePNum();
      }
      else if (choice.equals("ST")) {
        add.changeStName();
      }
      else if (choice.equals("CT")) {
        add.changeCity();
      }
      else if (choice.equals("STT")) {
        add.changeState();
      }
      else if (choice.equals("PIN")) {
        add.changePin();
      }
      else if (choice.equals("ALL")) {
        add.changePNum();
        add.changeStName();
        add.changeCity();
        add.changeState();
        add.changePin();
      }
      else if (choice.equals("Q")) {
        System.out.println("\n\n");
        break;
      }
      else {
        System.out.println("INPUT ERROR.\n");
      }
    } while(true);
  }
}