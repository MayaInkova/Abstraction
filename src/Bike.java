 class Bike extends  Vehicle {
     // Реализация на абстрактния метод startEngine
     @Override
     public void startEngine() {
         System.out.println("Starting the bike engine.");
     }

     // Реализация на абстрактния метод stopEngine
     @Override
     public void stopEngine() {
         System.out.println("Stopping the bike engine.");
     }
     // Главен клас за тестване
     public class Main {
         public static void main(String[] args) {
             // Създаване на обекти от тип Car и Bike
             Vehicle myCar = new Car();
             Vehicle myBike = new Bike();

             // Извикване на методите
             myCar.startEngine(); // Starting the car engine.
             myCar.honk();        // Honking the horn!
             myCar.stopEngine();  // Stopping the car engine.

             myBike.startEngine(); // Starting the bike engine.
             myBike.honk();        // Honking the horn!
             myBike.stopEngine();  // Stopping the bike engine.
         }
     }
 }

