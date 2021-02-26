public class Car {
        int howlong=10;
        int distance= howlong*60;
        public void start() {
            System.out.println("Поехали!");
        }
        public void drive (int howlong){
            System.out.println("Машина проедет "+distance+" км");
        }
    public void stop(){
            System.out.println("Остановиться");
    }
}

