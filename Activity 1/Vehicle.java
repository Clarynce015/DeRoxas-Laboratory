import java.util.Scanner;

class BaseVehicle{
    private String brand;
    private int speed;
    private String fuelType;

    public BaseVehicle (String vehicleBrand, int initialSpeed, String fuelType){
        this.brand = vehicleBrand;
        this.speed = initialSpeed;
        this.fuelType = fuelType;
    }
    public String getBrand(){
        return this.brand;
    }
    public int getSpeed(){
        return this.speed;
    }
    public String getfuelType(){
        return this.fuelType;
    }
    public void displayinfo(){
        System.out.println("Car Brand: " + brand);
        System.out.println("Speed: " + speed + " km");
        System.out.println("Fuel Type: " + fuelType);
    }
    public void main(String args[]){
        BaseVehicle vehicle = new BaseVehicle("Ford", 60, "Gas");

        System.out.println("Car Brand: " + vehicle.getBrand());
        System.out.println("Speed: " + vehicle.getSpeed() + " km");
        System.out.println("Fuel: " + vehicle.getfuelType());

    }
}

class Car extends BaseVehicle{
    private int numberOfDoors;
    
    public Car( String vehicleBrand, int initialSpeed, String fuelType, int doors){
        super(vehicleBrand, initialSpeed, fuelType);
        this.numberOfDoors = doors;
    }
    public int getNumberOfDoors(){
        return this.numberOfDoors;
    }
    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }

}

class Motorcycle extends BaseVehicle{
    private boolean hasSidecar;

    public Motorcycle(String vehicleBrand, int initialSpeed, String fuelType, boolean sidecar){
            super(vehicleBrand, initialSpeed, fuelType);
            this.hasSidecar = sidecar;


    }
    public boolean hasSidecar(){
        return this.hasSidecar;
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}

class Vehicle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to The Vehicle System!"); 
        System.out.println("First, The Car!");   
        System.out.println("Enter vehicle brand: ");
        String brand = scanner.nextLine();
        System.out.println("Enter vehicle speed: ");        
        int speed = scanner.nextInt();
        System.out.println("Enter vehicle fuel type: ");
        String fuelType = scanner.next();
        System.out.println("Enter number of doors: ");
        int doors = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Car car = new Car(brand, speed, fuelType, doors);
        car.displayinfo();
        System.out.println("Now for the motorcycle!"); 
        System.out.println("Enter motorcycle brand: ");
        String motorcycleBrand = scanner.nextLine();
        System.out.println("Enter motorcycle speed: ");
        int motorcycleSpeed = scanner.nextInt();
        System.out.println("Enter motorcycle fuel type: ");
        String motorcycleFuelType = scanner.next();
        System.out.println("Does the motorcycle have a sidecar? (Yes/No): ");
        String sidecarInput = scanner.next();
        boolean hasSidecar = sidecarInput.equalsIgnoreCase("Yes");

        Motorcycle motorcycle = new Motorcycle(motorcycleBrand, motorcycleSpeed, motorcycleFuelType, hasSidecar);
        motorcycle.displayinfo();
        scanner.close();
        

    }
        
}
