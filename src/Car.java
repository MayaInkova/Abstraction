 class Car extends  Vehicle {
     // Реализация на абстрактния метод startEngine
     @Override
     public void startEngine() {
         System.out.println("Starting the car engine.");
     }

     // Реализация на абстрактния метод stopEngine
     @Override
     public void stopEngine() {
         System.out.println("Stopping the car engine.");
     }
 }


