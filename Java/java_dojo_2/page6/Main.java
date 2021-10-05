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
    System.out.println("Distance: ");
    int inputDistance = scanner.nextInt();
    System.out.println("Moving " + inputDistance + "km ...");
    bcl1.run(inputDistance);
    System.out.println("Distance: " + bcl1.getDistance() + "km");
  }
}