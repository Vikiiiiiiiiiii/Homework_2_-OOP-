public class Otter extends Predator implements Walkable, Floatable{     // класс Выдра
   
    public Otter(String name) {
        super(name);
    }
    
    @Override
    public String feed() {
        return "Рыба, лягушки";
    }

    @Override
    public String speak() {
        return "Фщ-фщщ";
    }
    
    @Override
    public int runSpeed() {
        return 10;  
    }

    @Override
    public int floatSpeed() {           // скорость плавания
        return 55;  
    }

}

