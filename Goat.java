public class Goat extends Herbivore implements Walkable{    // класс Коза наследуется от Травоядных
    public Goat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Бее-е";
    }

    @Override
    public int runSpeed(){
        return 35;
    }
}
