public class Car {
    String model;
    long speed;
    double price;

    public Car(){

    }

    public Car (long speed, String model){
        this.speed = speed;
        this.model = model;
    }

    void printInfo(){
        System.out.println("Car: "+ this.price + " " +this.model);
    }

    boolean checkSpeed(){
        if(this.speed >=100){
            return true;
        }
        return this.speed>= 100;
    }
}



