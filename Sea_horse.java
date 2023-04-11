public class Sea_horse extends Fish implements Floatable{       // класс Морской конёк
    
    public Sea_horse(String name) {
        super(name);
    }
    
    @Override
    public String speak() {
        return "Буль-буль";
    }

    @Override
    public int floatSpeed() {           // скорость плавания
        return 38;  
    }

}

