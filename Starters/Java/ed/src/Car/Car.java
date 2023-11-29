package Car;

public class Car {
    int speed = 40;

    public Car(String make){

    }

    public void accelerate(int amount){
        this.speed += amount;
    }

    public int getSpeed(){
        return speed;
    }
}
