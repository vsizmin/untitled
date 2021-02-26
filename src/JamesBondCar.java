 class JamesBondCar extends Car{
    int distance = howlong*180;
     @Override
     public void drive(int howlong){
         System.out.println("Машина проедет"+distance+ " км");
     }
 }
