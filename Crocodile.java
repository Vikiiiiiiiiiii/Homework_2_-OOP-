public class Crocodile extends Reptile implements Walkable, Floatable{    // класс Крокодил 
   
    public Crocodile(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Хрр-хрр";
    }
    
    @Override
    public int runSpeed() {
        return 4;  
    }

    @Override
    public int floatSpeed() {           // скорость плавания
        return 70;  
    }

}