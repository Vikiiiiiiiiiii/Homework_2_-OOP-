public abstract class Herbivore extends Mammal{  // класс Травоядные 
    
    public Herbivore(String name){
        super(name);
    }

    @Override
    public String feed(){
        return "Трава";
    }

}
