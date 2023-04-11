public abstract class Fish extends Animal{     // класс Рыбы

    public Fish(String name){
        super(name);
    }

    @Override
    public String feed() {
        return "Мелкие рачки, креветки";
    }
}
