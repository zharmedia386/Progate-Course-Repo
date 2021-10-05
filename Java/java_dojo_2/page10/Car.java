class Car {
  private String name;
  private String color;
  private int distance = 0;
  private int fuel = 100;
  
  public void setName(String name){
    this.name = name;
  }
  
  public String getName(){
    return this.name;
  }
  
  public void setColor(String color){
    this.color = color;
  }
  
  public String getColor(){
    return this.color;
  }
  
  public void setDistance(int distance){
    this.distance = distance;
  }
  
  public int getDistance(){
    return this.distance;
  }
  
  public int run(int longDistance){
    this.fuel -= longDistance;
    return this.fuel;
  }
  
  public int addFuel(int amount){
    this.fuel += amount;
    return this.fuel;
  }
  
  public void setFuel(int fuel){
    this.fuel = fuel;
  }
  
  public int getFuel(){
    return this.fuel;
  }
}