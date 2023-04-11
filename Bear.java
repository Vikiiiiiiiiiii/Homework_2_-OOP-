public class Bear extends Predator implements Walkable{

    private int speed;
    public Bear(String name, int speed) {
        super(name);
        this.speed = speed;
    }


    @Override
    public String speak() {
        return "РРРЪ";
    }

    @Override
    public int runSpeed() {
        return speed;  // return 60; - если у нас только один медведь
    }
}
