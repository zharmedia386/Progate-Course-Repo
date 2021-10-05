import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberPeople = scanner.nextInt();
    
    for(int i = 1; i <= numberPeople;i++){
        System.out.println("Person number " + i);
        String firstName = scanner.next();
        String lastName = scanner.next();
        int age = scanner.nextInt();
        double  height = scanner.nextDouble();
        double  weight = scanner.nextDouble();
        
        System.out.println("My name is " + firstName + " " + lastName + ".");
        System.out.println("I am " + age + " years old.");
        if(age >= 18){
          System.out.println("I am an adult.");
        } else {
          System.out.println("I am not an adult.");
        }
        System.out.println("I am " + height + "m tall.");
        System.out.println("I weigh " + weight + "kg.");
        
        double BMI = weight / height / height;
        System.out.println("My BMI is " + Math.round(BMI) + ".");
        
        if(BMI >= 18.5 && BMI < 25.0){
          System.out.println("I am healthy!");
        } else {
          System.out.println("I am not healthy.");
        }
    }
    
  }
}
