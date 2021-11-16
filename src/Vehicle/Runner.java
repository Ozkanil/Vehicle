package Vehicle;

public class Runner {

    public static void main(String[] args) {
        Toyota toyota= new Toyota(36);
        toyota.accelerate(30);
        toyota.accelerate(20);
        toyota.steer(45);
        toyota.move(45,70);
    }
}
