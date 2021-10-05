import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Bicycle bcl1 = new Bicycle();
    bcl1.setName("Bianchi");
    bcl1.setColor("Green");
    bcl1.setDistance(0);
    System.out.println("【Bicycle Info】");
    System.out.println("Name: " + bcl1.getName());
    System.out.println("Color: " + bcl1.getColor());
    System.out.println("Distance: " + bcl1.getDistance() + "km");
    System.out.println("-----------------");
    System.out.print("Distance: ");
    int inputDistance1 = scanner.nextInt();
    System.out.println("Moving " + inputDistance1 + "km ...");
    bcl1.run(inputDistance1);
    System.out.println("Distance: " + bcl1.getDistance() + "km");
    
    System.out.println("=================");
    
    Car car1 = new Car();
    car1.setName("Ferrari");
    car1.setColor("Red");
    car1.setDistance(0);
    car1.setFuel(100);
    System.out.println("【Car Info】");
    System.out.println("Name: " + car1.getName());
    System.out.println("Color: " + car1.getColor());
    System.out.println("Distance: " + car1.getDistance() + "km");
    System.out.println("Fuel: " + car1.getFuel() + "L");
    System.out.println("-----------------");
    System.out.print("Distance: ");
    int inputDistance2 = scanner.nextInt();
    System.out.println("Moving " + inputDistance2 + "km ...");
    if(car1.getFuel() > inputDistance2) {
      System.out.println("Distance: " + inputDistance2 + "km");
      System.out.println("Fuel: " + car1.run(inputDistance2) + "L");
    } else if(car1.getFuel() <= inputDistance2){
      System.out.println("Not enough fuel");
      car1.setDistance(0);
      System.out.println("Distance: " + car1.getDistance() + "km");
      System.out.println("Fuel: " + car1.getFuel() + "L");
    }
    System.out.println("-----------------");
    System.out.print("Enter amount to refuel: ");
    int inputFuel1 = scanner.nextInt();
    System.out.println("Adding " + inputFuel1 + "L ...");
    if(inputFuel1 <= 0) {
      System.out.println("No fuel added");
      System.out.println("Fuel: " + car1.getFuel() + "L");
    } else if((inputFuel1 + car1.getFuel()) >= 100) {
      System.out.println("Tank now full");
      car1.setFuel(100);
      System.out.println("Fuel: " + car1.getFuel() + "L");
    } else {
      car1.addFuel(inputFuel1);
      System.out.println("Fuel: " + car1.getFuel() + "L");
    }
  }
}