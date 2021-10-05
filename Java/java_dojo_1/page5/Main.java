import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String firstName = scanner.next();
    String lastName = scanner.next();
    int age = scanner.nextInt();
    System.out.println("My name is " + firstName + " " + lastName + ".");
    System.out.println("I am " + age + " years old.");
    if(age >= 18){
      System.out.println("I am an adult.");
    } else {
      System.out.println("I am not an adult.");
    }
  }
}
